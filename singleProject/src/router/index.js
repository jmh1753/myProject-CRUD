import Vue from 'vue'
import Router from 'vue-router'
import myComponent from '@/components/myComponent'
import FreeBoard from '@/components/pages/FreeBoard'
import InsertFreeBoard from '@/components/pages/InsertFreeBoard'
import UpdateFreeBoard from '@/components/pages/UpdateFreeBoard'
import FreeBoardDetail from '@/components/pages/FreeBoardDetail'

Vue.use(Router)

export default new Router({
  mode:"history",
  routes: [
    {path: '/myComponent', name: 'myComponent',component: myComponent},
    {path: '', name: 'freeboard', component: FreeBoard},
    {path: '/insertfreeboard', name: 'insertfreeboard', component: InsertFreeBoard},
    {path: '/updatefreeboard', name: 'updatefreeboard', component: UpdateFreeBoard},
    {path: '/freeboarddetail', name: 'freeboarddetail', component: FreeBoardDetail}


  
  ]
})
