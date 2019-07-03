<template>
  <div id="app">
  
    <router-view/>
 
  </div>
</template>

<script>
addEventListener("load", function () {
  setTimeout(()=>{
    window.scrollTo(0, 1);
  }, 0);
}, false);

export default {
   
}
</script>

<style>
#app{height:100%;}
</style>
