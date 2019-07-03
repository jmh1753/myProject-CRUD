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
        <form @submit.prevent="insertgo">
        <table class="table">
                <tr>
                    <td style="width:85%">
                    <textarea class="form-control" rows="1" cols="80" name="title" title="제목" style="overflow:hidden" placeholder="제목을 입력해주세요" v-model="title">
                    </textarea>
                    </td>  
                    <td style="width:15%">19/06/29. 16:20 </td>                                       
                </tr>
                <tr>
                    <td style="width:100%" colspan="2">
                    <i class="fas fa-user-circle"></i><textarea class="form-control" rows="1" cols="30" name="userId" title="제목" style="overflow:hidden" placeholder="작성자" v-model="userid">
                    </textarea>
                    </td>    
                </tr>
                <tr>
                    <td colspan="2">
                    <textarea class="form-control" rows="14" cols="150" name="content" title="내용" placeholder="내용을 입력해주세요" v-model="content">
                    </textarea> 
                    </td>
                </tr>
                <tr>
                <td class="text-muted" colspan="2">          
                    저작권 등 다른 사람의 권리를 침해하거나 명예를 훼손하는 게시글은 이용약관 및 관련법률에 의해 제재를 받으실 수 있습니다.              
                </td>             
                </tr> 
            </table>
            <input type="submit" style="float:right" class="btn btn-outline-secondary btn-sm" value="작성완료" @click="insertgo">
        </form>
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

export default {
    data(){
        return{
            context : 'http://localhost:9000/board',
        }
    },
    components:{
        headerComponent,
        copyright,
        movetop
    },
    methods:{
        insertgo(e){
            e.preventDefault();
            alert("게시글작성완료버튼 클릭")
            let data = {
                title: this.title,
                content: this.content,
                userid : this.userid
            }
            let headers = {
            'Content-Type': 'application/json',
            'Authorization' : 'JWT fefege..'
            }
            alert(data.title)
            alert(data.content)
            //alert(this.customerId)
            axios.post(`${this.context}`, JSON.stringify(data), {headers:headers})
                    .then(res=>{
                        alert(`insert성공 : ${res.result}`)
                        this.$router.push("/freeboard")
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
