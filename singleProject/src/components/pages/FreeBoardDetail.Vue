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
                <td style="width:85%">{{this.$store.state.title}} | freeBoard</td>  
                <td style="width:15%">{{this.$store.state.regdate}}</td>                                       
            </tr>
            <tr>
                <td style="width:85%"><i class="fas fa-user-circle"></i> {{this.$store.state.userid}}</td>    
                <td style="width:85%"><router-link to="/updatefreeboard">수정</router-link> | <span class="link" @click="deleteboard">삭제</span></td> 
            </tr>
            <tr>
                <td class="content" colspan="2">
                    {{this.$store.state.content}}
                <br><br>
                </td>
            </tr>
            <tr>
               <td class="text-muted" colspan="2">          
                  저작권 등 다른 사람의 권리를 침해하거나 명예를 훼손하는 게시글은 이용약관 및 관련법률에 의해 제재를 받으실 수 있습니다.              
               </td>             
            </tr> 
        </table>            
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
import {store} from '../../store'

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
        title(){
            alert(store.state.title);
        },
        deleteboard(){
            var con = confirm("정말 삭제하시겠습니까?")
            if(con){
                alert("정말삭제")

            }else{
                alert("삭제취소")
            }
        }
    }
}
</script>
<style scoped>
.link{    color:#007bff; cursor: pointer;} 
.link:hover{ color:#0056b3;}
</style>
