import Vue from 'vue'
import Router from 'vue-router'
import myComponent from '@/components/myComponent'
// import Home from '@/components/pages/1Home'
// import Join from '@/components/pages/2Join'
// import Login from '@/components/pages/3Login'
// import FindUser from '@/components/pages/4FindUser'
// import Mypage from '@/components/pages/5Mypage'
import SearchMeeting from '@/components/pages/SearchMeeting'
import FreeBoard from '@/components/pages/FreeBoard'
import InsertFreeBoard from '@/components/pages/InsertFreeBoard'
import UpdateFreeBoard from '@/components/pages/UpdateFreeBoard'
import FreeBoardDetail from '@/components/pages/FreeBoardDetail'

Vue.use(Router)

export default new Router({
  mode:"history",
  routes: [
    {path: '/myComponent', name: 'myComponent',component: myComponent},
    {path: '/', name: 'searchMeeting', component: SearchMeeting},
    {path: '/freeboard', name: 'freeboard', component: FreeBoard},
    {path: '/insertfreeboard', name: 'insertfreeboard', component: InsertFreeBoard},
    {path: '/updatefreeboard', name: 'updatefreeboard', component: UpdateFreeBoard},
    {path: '/freeboarddetail', name: 'freeboarddetail', component: FreeBoardDetail}


  
  ]
})
