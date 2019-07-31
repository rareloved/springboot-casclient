package com.andy.springbootcasclient.config;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.cas.CasRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * DeputeUser: andy
 * Date: 2018/12/3
 * Time: 11:38
 */
public class ShiroCasRealm extends CasRealm{
    private static final Logger logger = LoggerFactory.getLogger(ShiroCasRealm.class);

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        AuthenticationInfo authc = super.doGetAuthenticationInfo(token);

        String account = (String) authc.getPrincipals().getPrimaryPrincipal();

//        User user = userManageInterface.getUserByCode(account);
        //保存session
        SecurityUtils.getSubject().getSession().setAttribute("user", account);

//        todo 登录日志
        return authc;
    }

    /**
     * 权限认证，为当前登录的Subject授予角色和权限
//     * @see 经测试：本例中该方法的调用时机为需授权资源被访问时
//     * @see 经测试：并且每次访问需授权资源时都会执行该方法中的逻辑，这表明本例中默认并未启用AuthorizationCache
//     * @see 经测试：如果连续访问同一个URL（比如刷新），该方法不会被重复调用，Shiro有一个时间间隔（也就是cache时间，在ehcache-shiro.xml中配置），超过这个时间间隔再刷新页面，该方法会被执行
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //获取当前登录输入的用户名，等价于(String) principalCollection.fromRealm(getName()).iterator().next();
        String loginName = (String)super.getAvailablePrincipal(principalCollection);
        logger.info("##################执行Shiro权限认证##################");
        List<String> roleLists = new ArrayList<String>();
//        todo 角色列表
//        for (Role role:roleManageInterface.getRoless(loginName)){
//            roleLists.add(role.getRoleCode());
//        }
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();;
        //权限信息对象info,用来存放查出的用户的所有的角色（role）及权限（permission）
        //todo 用户的角色权限列表
        List<String> permissions = new ArrayList<>();
//      List<String> permissions = resourceInterface.getResources(roleLists);
        authorizationInfo.addRoles(roleLists);
        authorizationInfo.addStringPermissions(permissions);
        authorizationInfo.addRole("admin");
        authorizationInfo.addStringPermission("admin:manage");
        return authorizationInfo;
    }
}
