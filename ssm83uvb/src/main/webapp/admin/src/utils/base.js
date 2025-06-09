const base = {
    get() {
                return {
            url : "http://localhost:8080/ssm83uvb/",
            name: "ssm83uvb",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm83uvb/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "病人跟踪治疗信息管理系统"
        } 
    }
}
export default base
