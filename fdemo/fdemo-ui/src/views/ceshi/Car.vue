<template>
    <div class="car">
        <header></header>
        <nav></nav>
    </div>
</template>

<script>
import header from "@/components/headerN.vue";
import nav from "@/components/nav";
    export default {
        name: "car",
        comments:{header,nav}
    }
</script>

<style scoped>
    .car{
        width: 1200px;
        margin: 0 auto;
        /*background: aqua;*/
    }
</style>