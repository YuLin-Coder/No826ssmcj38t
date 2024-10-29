const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmcj38t/",
            name: "ssmcj38t",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmcj38t/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "平时成绩管理系统"
        } 
    }
}
export default base
