import router from "./router.js";

const {createApp} = Vue

const app = createApp({
    setup(){
        return{

        }
    }
})

app.use(router)
app.mount("#app")