<template>
    <div class="zhengfu">
        <Header></Header>
        <Nav></Nav>
        <ChildQ></ChildQ>
    </div>
</template>

<script>
    import Header from "@/components/headerN.vue";
    import ChildQ from "@/components/Child/ChildQ";
    import Nav from "@/components/nav";

    export default {
        name: "zhengfu",
        components: {
            Header,
            ChildQ,
            Nav
        },
    }
</script>

<style scoped>
    /*  :root   html    *   */
    /**{*/
    /*    padding: 0;*/
    /*    margin: 0;*/
    /*}*/
    .zhengfu{
        width: 1200px;
        margin: 0 auto;
        /*background: aqua;*/
    }
</style>