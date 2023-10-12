<template>
    <div class="home-top">
        <div>
            <span style="font-weight: bold;font-size: 30px">Firstsnow && Lucky</span>
        </div>
        <div>
            <span style="font-size: 30px;margin-right: 0px;font-weight: bold">智慧城市</span>
        </div>
        <div>
<!--            tag="a" target="_blank"-->
            <router-link style="font-size: 30px" :to="{name:'Login'}">
                <i style="font-size: 30px" class="el-icon-users-solid">{{login}}</i>
            </router-link>
        </div>
    </div>
</template>

<script>
    export default {
        name: "headerN",
        data(){
            return{
                login:'智慧城市后台数据管理登录',
                // username:this.$router.params.username
            }
        },
        methods:{

        }
        // username:this.$router.params.username
    }
</script>

<style scoped>
    .home-top {
        display: flex;
        justify-content: space-between;
    }
</style>