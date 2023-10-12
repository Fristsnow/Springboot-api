import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'

Vue.config.productionTip = false
Vue.config.silent = false

import axios from "axios";

// axios.defaults.baseURL = '/'
// axios.defaults.timeout = 8000;
//
// axios.interceptors.request.use((config) => {
//     config.headers.Authorization = window.sessionStorage.getItem('token')
//     return config
// })
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
Vue.prototype.$axios = axios

Vue.use(ElementUI)

new Vue({
    router,
    store,
    render: h => h(App)
}).$mount('#app')
