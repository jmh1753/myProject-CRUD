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
                <thead>
                    <tr>
                        <th style="width:10%">no</th>
                        <th style="width:50%">제목</th>
                        <th style="width:15%">글쓴이</th>
                        <th style="width:15%">작성일</th>
                        <th style="width:10%">조회수</th>
                    </tr>
                </thead>
                <tbody>
                    <tr v-for="item in boardlist" v-bind:key="item.id">
                        <td>{{item.id}}</td>
                        <td @click="detail(item)" style="color:red; cursor:pointer;">{{item.title}}</td>
                        <td>{{item.userid}}</td>
                        <td>{{item.regdate}}</td>
                        <td>{{item.view}}</td>                    
                    </tr> 
                    
                </tbody>
            </table>
            
            <router-link class="btn btn-outline-secondary btn-sm" to="/insertfreeboard">글쓰기</router-link>
            

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
import {store} from '@/store/index'

export default {
    data(){
        return{
            context : 'http://localhost:9000/board',
            boardlist : []
        }
    },

    components:{
        headerComponent,
        copyright,
        movetop
    },

    methods:{
        detail(item){
            store.state.id = item.id;
            store.state.userid = item.userid;
            store.state.title = item.title;
            store.state.content = item.content;
            store.state.regdate = item.regdate;
            store.state.view = item.view;
            this.$router.push('/freeboarddetail')
        }
    },

    created(){
        axios.get(`${this.context}/list`).then((response)=>{
            this.boardlist = response.data;
         
        })
       
    }
    
    
}
</script>



<style scoped>



</style>
