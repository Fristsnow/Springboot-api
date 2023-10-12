<template>
    <div class="bianming">
        <header></header>
        <nav></nav>
    </div>
</template>

<script>
    import header from "@/components/headerN.vue";
    import nav from "@/components/nav";
    export default {
        name: "bianming",
        comments:{header,nav}
    }
</script>

<style scoped>
    .bianming{
        width: 1200px;
        margin: 0 auto;
        /*background: aqua;*/
    }
</style>