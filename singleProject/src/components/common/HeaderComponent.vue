<template>
     <header>
            <div class="container">
                <!-- nav -->
                <nav class="py-3 d-lg-flex">
                    <div id="logo">
                        <h1> <router-link to="/"><span class="fa fa-university"></span> TardyGram</router-link></h1>
                    </div>
                    <label for="drop" class="toggle"><span class="fa fa-bars"></span></label>
                    <input type="checkbox" id="drop" />
                    <ul class="menu ml-auto mt-1">
                        <li class="active"><router-link to="/"></router-link></li>
                        <li class=""><a href="#"></a></li>
                        <li class=""><a href="#"></a></li>
                        <li class=""><a href="#"></a></li>
                        <li class="last-grid"><router-link to="/">freeBoard</router-link></li>
                    </ul>
                </nav>
                <!-- //nav -->
            </div>
        </header>
</template>
<script>
export default {
    data(){
        return{
            //데이터key:value,데이터key2:value
        }
    },

    methods:{
        // 메서드이름(){}
    }
}
</script>
