import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import Login from "@/views/Loginall/Login";
import navitem from "@/views/pages/navitem"
import Child from "@/views/ceshi/Child";
import Lajifenlei from "@/views/Lajifenlei";
import Shuzi from "@/views/Shuzi";
import Zhengfu from "@/views/Zhengfu";
import Zhiyuan from "@/views/Zhiyuan";
import Zhuce from "@/views/Loginall/Zhuce";
import Wpassword from "@/views/Loginall/Wpassword";

Vue.use(VueRouter)

const routes = [
    {path: '/', name: 'home', component: Home},
    {path: '/Login', name: 'Login', component: Login},
    {path: '/navitem', name: 'navitem', component: navitem,},
    {path: '/Child', name: 'Child', component: Child},
    {path: '/diler', name: 'diler', component: () => import('@/views/pages/diler.vue'),},
    {path: '/Lajifenlei', name: 'Lajifenlei', component: Lajifenlei},
    {path: '/Shuzi', name: 'Shuzi', component: Shuzi},
    {path: '/Zhengfu', name: 'Zhengfu', component: Zhengfu},
    {path: '/Zhiyuan', name: 'Zhiyuan', component: Zhiyuan},
    // {path:'/Bianming',name:'Bianming',component: Bianming},
    // {path:'/Car',name:'Car',component: Car},
    // {path: '/Life',name: 'Life',component: Life},
    {path: '/Loginall/Zhuce', name: 'Zhuce', component: Zhuce},
    {path: '/Loginall/Wpassword', name: 'Wpassword', component: Wpassword}
]

const router = new VueRouter({
    routes
})

export default router
