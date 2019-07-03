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
                    <li class="breadcrumb-item" aria-current="page">Category</li>
                </ol>
            </nav>
            </div>
        </div>
        <!-- //breadcrumb -->
        
        <!-- advantages and details -->
        <section class="advantages pt-5" >
            <div class="container pb-lg-5" > 
                 <!-- style="border:1px solid black;" -->
                <div class="row">
                    <div class="col-xs-4 col-sm-5" >
                        <h5>모임</h5>
                        <ul class="category_menu">
                            <li class="list-group-item col-xs-6 col-sm-3 text-muted disabled" aria-disabled="true">스터디</li>
                            <li class="list-group-item col-xs-6 col-sm-3 text-muted">운동</li>
                            <li class="list-group-item col-xs-6 col-sm-3 text-muted">강연</li>
                            <li class="list-group-item col-xs-6 col-sm-3 text-muted">교육</li>
                            <li class="list-group-item col-xs-6 col-sm-3 text-muted">패션</li>
                            <li class="list-group-item col-xs-6 col-sm-3 text-muted">동창회</li>
                            <li class="list-group-item col-xs-6 col-sm-3 text-muted">친목</li>
                            <li class="list-group-item col-xs-6 col-sm-3 text-muted">여행</li>
                        </ul>
                    </div>
                

                    <div class="col-xs-4 col-sm-5">
                         <h5>지역</h5>
                            <ul class="category_menu">
                                <li class="list-group-item col-xs-6 col-sm-3 text-muted disabled" aria-disabled="true">서울</li>
                                <li class="list-group-item col-xs-6 col-sm-3 text-muted">경기</li>
                                <li class="list-group-item col-xs-6 col-sm-3 text-muted">인천</li>
                                <li class="list-group-item col-xs-6 col-sm-3 text-muted">강원</li>
                                <li class="list-group-item col-xs-6 col-sm-3 text-muted">충남</li>
                                <li class="list-group-item col-xs-6 col-sm-3 text-muted">충북</li>
                                <li class="list-group-item col-xs-6 col-sm-3 text-muted">세종</li>
                                <li class="list-group-item col-xs-6 col-sm-3 text-muted">대전</li>
                                <li class="list-group-item col-xs-6 col-sm-3 text-muted">경북</li>
                                <li class="list-group-item col-xs-6 col-sm-3 text-muted">대구</li>
                                <li class="list-group-item col-xs-6 col-sm-3 text-muted">울산</li>
                                <li class="list-group-item col-xs-6 col-sm-3 text-muted">전북</li>
                                <li class="list-group-item col-xs-6 col-sm-3 text-muted">광주</li>
                                <li class="list-group-item col-xs-6 col-sm-3 text-muted">전남</li>
                                <li class="list-group-item col-xs-6 col-sm-3 text-muted">경남</li>
                                <li class="list-group-item col-xs-6 col-sm-3 text-muted">울산</li>
                                <li class="list-group-item col-xs-6 col-sm-3 text-muted">부산</li>
                                <li class="list-group-item col-xs-6 col-sm-3 text-muted">제주</li>
                            </ul>
                    </div>
                     <div class="col-xs-4 col-sm-2">
                         <h5>시간</h5>
                            <ul class="category_menu">
                                <li class="list-group-item col-xs-6 col-sm-6 text-muted disabled" aria-disabled="true">오전</li>
                                <li class="list-group-item col-xs-6 col-sm-6 text-muted">오후</li>
                            </ul>
                    </div>
                 
                </div>
                <button type="button" class="btn btn-outline-secondary">관리</button>
            </div>
        </section>
        <br><br><br><br><br><br><br><br><br><br><br><br><br><br>
        <copyright></copyright>      
        <movetop></movetop>
    </div>
</template>

<script>
// import 컴포넌트이름 from "../컴포넌트경로"
import headerComponent from "../common/HeaderComponent"
import copyright from "../common/copyright"
import movetop from "../common/movetop"
export default {
    data(){
        return{
            //데이터key:value,데이터key2:value
        }
    },
    components:{
        // 컴포넌트이름
        headerComponent,
        copyright,
        movetop
    },
    methods:{
        // 메서드이름(){}
    }
}
</script>



<style scoped>
.category_menu{margin-bottom:30px;}
.category_menu:after{display: block; content:''; clear:both;}
.category_menu li{text-align:center;float:left}
.btn.btn-outline-secondary{float:right; margin-top:50px;}
h5{margin-bottom:20px;}


</style>
