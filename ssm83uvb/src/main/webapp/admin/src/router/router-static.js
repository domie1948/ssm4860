import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import fenlei from '@/views/modules/fenlei/list'
    import news from '@/views/modules/news/list'
    import bingrenzhiliaozhuangkuang from '@/views/modules/bingrenzhiliaozhuangkuang/list'
    import shangchuanhesuanjiancebaogao from '@/views/modules/shangchuanhesuanjiancebaogao/list'
    import bingren from '@/views/modules/bingren/list'
    import binglicaiji from '@/views/modules/binglicaiji/list'
    import chat from '@/views/modules/chat/list'
    import messages from '@/views/modules/messages/list'
    import shangchuanxingdongguiji from '@/views/modules/shangchuanxingdongguiji/list'
    import yuyue from '@/views/modules/yuyue/list'
    import yisheng from '@/views/modules/yisheng/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/fenlei',
        name: '分类',
        component: fenlei
      }
          ,{
	path: '/news',
        name: '医疗资讯',
        component: news
      }
          ,{
	path: '/bingrenzhiliaozhuangkuang',
        name: '病人治疗状况',
        component: bingrenzhiliaozhuangkuang
      }
          ,{
	path: '/shangchuanhesuanjiancebaogao',
        name: '上传核酸检测报告',
        component: shangchuanhesuanjiancebaogao
      }
          ,{
	path: '/bingren',
        name: '病人',
        component: bingren
      }
          ,{
	path: '/binglicaiji',
        name: '病例采集',
        component: binglicaiji
      }
          ,{
	path: '/chat',
        name: '在线咨询',
        component: chat
      }
          ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
          ,{
	path: '/shangchuanxingdongguiji',
        name: '上传行动轨迹',
        component: shangchuanxingdongguiji
      }
          ,{
	path: '/yuyue',
        name: '预约',
        component: yuyue
      }
          ,{
	path: '/yisheng',
        name: '医生',
        component: yisheng
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
