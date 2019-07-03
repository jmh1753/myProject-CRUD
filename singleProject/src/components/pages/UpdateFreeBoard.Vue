<template>
<div>
    <!-- <컴포넌트></컴포넌트> -->
    <headerComponent></headerComponent>

    <!-- inner-banner -->
    <section class="inner-banner" id="home">
        <div class="inner-layer">
            <div class="container">
            </div>
        </div>
    </section>
    <!-- //inner-banner -->

    <!-- breadcrumb -->
    <div class="breadcrumb-w3pvt">
        <div class="container">
        <nav aria-label="breadcrumb">
            <ol class="breadcrumb">
                <li class="breadcrumb-item">
                    <a href="index.html">Home</a>
                </li>
                <li class="breadcrumb-item" aria-current="page">Freeboard</li>
            </ol>
        </nav>
        </div>
    </div>
    <!-- //breadcrumb -->

    <div class="container">
       <table class="table">
            <tr>
                <td style="width:85%">
                   <textarea class="form-control" rows="1" cols="80" name="subject" title="제목" style="overflow:hidden">처음으로 가입했어요 반가워요  
                   </textarea>
                </td>  
                <td style="width:15%">19/06/29. 16:20 </td>                                       
            </tr>
            <tr>
                <td style="width:100%" colspan="2"><i class="fas fa-user-circle"></i> 문호</td>    
            </tr>
            <tr>
                <td colspan="2">
                   <textarea class="form-control" rows="14" cols="150" name="content" title="내용" >Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper ultricies nisi. Nam eget dui. Etiam rhoncus. Maecenas tempus, tellus eget condimentum rhoncus, sem quam semper libero, sit amet adipiscing sem neque sed ipsum. Nam quam nunc, blandit vel, luctus pulvinar, hendrerit id, lorem. Maecenas nec odio et ante tincidunt tempus. Donec vitae sapien ut libero venenatis faucibus. Nullam quis ante. Etiam sit amet orci eget eros faucibus tincidunt. Duis leo. Sed fringilla mauris sit amet nibh. Donec sodales sagittis magna. Sed consequat, leo eget bibendum sodales, augue velit cursus nunc,
                   </textarea> 
                </td>
            </tr>
            <tr>
               <td class="text-muted" colspan="2">          
                  저작권 등 다른 사람의 권리를 침해하거나 명예를 훼손하는 게시글은 이용약관 및 관련법률에 의해 제재를 받으실 수 있습니다.              
               </td>             
            </tr> 
        </table>
        <router-link class="btn btn-outline-secondary btn-sm" to="/freeboarddetail" style="float:right">수정완료</router-link>   
    </div>

    <br><br><br><br><br><br><br><br><br>
        <copyright></copyright>      
        <movetop></movetop>
</div>
</template>
<script>
import headerComponent from "../common/HeaderComponent"
import copyright from "../common/copyright"
import movetop from "../common/movetop"
export default {
    data(){
        return{
            
        }
    },
    components:{
        headerComponent,
        copyright,
        movetop
    },
    methods:{

    }
}
</script>
<style scoped>

</style>
