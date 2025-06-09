
var projectName = '病人跟踪治疗信息管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
]


var indexNav = [

{
	name: '医生',
	url: './pages/yisheng/list.html'
}, 

{
	name: '医疗资讯',
	url: './pages/news/list.html'
},
{
	name: '留言反馈',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/ssm83uvb/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


chatFlag = true


var menu = [{"backMenu":[{"child":[{"buttons":["查看","修改","删除","新增"],"menu":"病人","menuJump":"列表","tableName":"bingren"}],"menu":"病人管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"病例采集","menuJump":"列表","tableName":"binglicaiji"}],"menu":"病例采集管理"},{"child":[{"buttons":["新增","查看","修改","删除","审核"],"menu":"预约","menuJump":"列表","tableName":"yuyue"}],"menu":"预约管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"医生","menuJump":"列表","tableName":"yisheng"}],"menu":"医生管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"上传核酸检测报告","menuJump":"列表","tableName":"shangchuanhesuanjiancebaogao"}],"menu":"上传核酸检测报告管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"上传行动轨迹","menuJump":"列表","tableName":"shangchuanxingdongguiji"}],"menu":"上传行动轨迹管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"分类","menuJump":"列表","tableName":"fenlei"}],"menu":"分类管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"病人治疗状况","menuJump":"列表","tableName":"bingrenzhiliaozhuangkuang"}],"menu":"病人治疗状况管理"},{"child":[{"buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"在线咨询","tableName":"chat"},{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"医疗资讯","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","预约"],"menu":"医生列表","menuJump":"列表","tableName":"yisheng"}],"menu":"医生模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改"],"menu":"病例采集","menuJump":"列表","tableName":"binglicaiji"}],"menu":"病例采集管理"},{"child":[{"buttons":["支付","修改","新增","查看"],"menu":"预约","menuJump":"列表","tableName":"yuyue"}],"menu":"预约管理"},{"child":[{"buttons":["预约","查看"],"menu":"医生","menuJump":"列表","tableName":"yisheng"}],"menu":"医生管理"},{"child":[{"buttons":["新增","修改","查看"],"menu":"上传核酸检测报告","menuJump":"列表","tableName":"shangchuanhesuanjiancebaogao"}],"menu":"上传核酸检测报告管理"},{"child":[{"buttons":["新增","修改","查看"],"menu":"上传行动轨迹","menuJump":"列表","tableName":"shangchuanxingdongguiji"}],"menu":"上传行动轨迹管理"},{"child":[{"buttons":["查看"],"menu":"病人治疗状况","menuJump":"列表","tableName":"bingrenzhiliaozhuangkuang"}],"menu":"病人治疗状况管理"}],"frontMenu":[{"child":[{"buttons":["查看","预约"],"menu":"医生列表","menuJump":"列表","tableName":"yisheng"}],"menu":"医生模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"病人","tableName":"bingren"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
