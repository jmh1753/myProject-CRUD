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
                   <textarea class="form-control" rows="1" cols="80" name="title" style="overflow:hidden" v-model="title">
                   </textarea>
                </td>  
                <td style="width:15%">{{this.$store.state.regdate}}</td>                                       
            </tr>
            <tr>
                <td style="width:100%" colspan="2"><i class="fas fa-user-circle"></i> {{this.$store.state.userid}}</td>    
            </tr>
            <tr>
                <td colspan="2">
                   <textarea class="form-control" rows="14" cols="150" name="content" v-model="content">
                   </textarea> 
                </td>
            </tr>
            <tr>
               <td class="text-muted" colspan="2">          
                  저작권 등 다른 사람의 권리를 침해하거나 명예를 훼손하는 게시글은 이용약관 및 관련법률에 의해 제재를 받으실 수 있습니다.              
               </td>             
            </tr> 
        </table>
        <!-- <router-link class="btn btn-outline-secondary btn-sm" to="/freeboarddetail" style="float:right">수정완료</router-link>   -->
        <input type="button" style="float:right" class="btn btn-outline-secondary btn-sm" value="진짜수정완료" @click="updatego">
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
import axios from 'axios'
import {store} from '../../store'

export default {
    data(){
        return{
            context : 'http://localhost:9000/board',
            title : store.state.userid,
            content : store.state.content
        }
    },
    components:{
        headerComponent,
        copyright,
        movetop
    },
    methods:{
        updatego(e){
            e.preventDefault();
            alert("게시글수정버튼 클릭")
            let data = {
                title: this.title,
                content: this.content,                              
            }
            let headers = {
            'Content-Type': 'application/json',
            'Authorization' : 'JWT fefege..'
            }
            alert("id: "+this.$store.state.id)
            alert("updatego title: "+data.title)
            alert("updatego content: "+data.content)
           
            axios.put(`${this.context}/${this.$store.state.id}`, JSON.stringify(data), {headers:headers})
                    .then(res=>{
                        alert(`update성공 : ${res.result}`)
                        this.$router.push("/freeboard")
                        // this.$router.link(-1);
                    })
                    .catch(e=>{
                        alert('에러')
                    })
        }



        


    }
}
</script>
<style scoped>

</style>
