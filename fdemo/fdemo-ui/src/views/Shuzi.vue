<template>
    <div class="Shuzi">
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
        name: "Shuzi",
        components: {
            Header,
            ChildQ,
            Nav
        },
    }
</script>

<style scoped>
    .Shuzi{
        width: 1200px;
        margin: 0 auto;
        /*background: aqua;*/
    }
</style>