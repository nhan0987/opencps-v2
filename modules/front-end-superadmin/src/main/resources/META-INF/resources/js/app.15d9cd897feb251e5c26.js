webpackJsonp([3],{179:function(t,n,e){"use strict";e.d(n,"a",function(){return j});var a=e(211),s=e.n(a),o=e(18),i=e(258),r=e(254),c=e.n(r),u=e(190),d=e.n(u),l=e(262),p=e.n(l);o.a.use(c.a),o.a.use(i.a);var j=new i.a.Store({state:{initData:null,loading:!1,loadingTable:!1,error:null,user:null,index:0,trangThaiHoSoList:p.a.trangThaiHoSoList},actions:{clearError:function(t){(0,t.commit)("clearError")},loadInitResource:function(t){var n=t.commit,e=t.state;return null==e.initData?new s.a(function(t,e){var a={},s=window.location.href,o=window.location.href.lastIndexOf("#/");o>0&&(s=window.location.href.substr(0,o)),d.a.get(s+p.a.renderURLInit,a).then(function(e){var a=e.data;n("setInitData",a),t(a)}).catch(function(t){console.log(t),e(t),n("setInitData",{abc:123})})}):new s.a(function(t,n){t(e.initData)})},loadHandsOnTableData:function(t,n){var e=(t.commit,t.state);return new s.a(function(t,a){j.dispatch("loadInitResource").then(function(s){var o={params:{groupId:e.initData.groupId}},i="";"1"===n.type?i=e.initData.getActionConfigs:"2"===n.type?i=e.initData.getMenuConfigs:"3"===n.type&&(i=e.initData.getStepConfigs),d.a.get(i,o).then(function(e){var a=e.data;a.colHeaders=p.a.colHeaders[n.type],a.columns=p.a.columns[n.type],t(a)}).catch(function(t){console.log(t),a(t)})})})},addOrEditData:function(t,n){var e=(t.commit,t.state);return new s.a(function(t,a){j.dispatch("loadInitResource").then(function(s){var o="";"1"===n.type?o=e.initData.restActionConfigs:"2"===n.type?o=e.initData.restMenuConfigs:"3"===n.type&&(o=e.initData.restStepConfigs),n.isAdd?d()({method:"post",url:o,headers:{groupId:e.initData.groupId},data:n}).then(function(n){var e=n.data;t(e)}).catch(function(t){console.log(t),a(t)}):d()({method:"put",url:o+"/"+n.actionCode,headers:{groupId:e.initData.groupId},data:n}).then(function(n){var e=n.data;t(e)}).catch(function(t){console.log(t),a(t)})})})}},mutations:{setLoading:function(t,n){t.loading=n},setLoadingTable:function(t,n){t.loadingTable=n},setError:function(t,n){t.error=n},clearError:function(t){t.error=null},setIndex:function(t,n){t.index=n},setInitData:function(t,n){t.initData=n}},getters:{loading:function(t){return t.loading},loadingTable:function(t){return t.loadingTable},error:function(t){return t.error},index:function(t){return t.index},loadtrangThaiHoSoList:function(t){return t.trangThaiHoSoList},loadingInitData:function(t){return t.initData}}})},180:function(t,n){},181:function(t,n){},182:function(t,n){},183:function(t,n){},185:function(t,n,e){var a=e(188)(e(209),e(255),null,null);t.exports=a.exports},208:function(t,n,e){"use strict";Object.defineProperty(n,"__esModule",{value:!0});var a=e(182),s=(e.n(a),e(181)),o=(e.n(s),e(180)),i=(e.n(o),e(178)),r=(e.n(i),e(183)),c=(e.n(r),e(18)),u=e(185),d=e.n(u),l=e(21),p=e(187),j=e.n(p),h=e(179),f=e(184),m=e(186),g=e.n(m);c.a.use(g.a),c.a.use(f.default),c.a.use(j.a),c.a.config.productionTip=!1,new c.a({el:"#app",router:l.a,store:h.a,render:function(t){return t(d.a)},created:function(){var t=this;t.$nextTick(function(){t.$store.dispatch("loadInitResource")})}})},209:function(t,n,e){"use strict";Object.defineProperty(n,"__esModule",{value:!0});var a=e(21);n.default={data:function(){return{isCallBack:!0}},computed:{loading:function(){return this.$store.getters.loading},currentIndex:function(){return this.$store.getters.index},trangThaiHoSoList:function(){return this.$store.getters.loadtrangThaiHoSoList}},updated:function(){var t=this;t.$nextTick(function(){var n=t.$router.history.current.params;n.hasOwnProperty("index")&&t.isCallBack&&(t.isCallBack=!1,t.$store.commit("setIndex",n.index))})},methods:{toTableIndexing:function(t,n){this.$store.commit("setIndex",n),a.a.push("/danh-sach-ho-so/"+n)}}}},21:function(t,n,e){"use strict";var a=e(212),s=e.n(a),o=e(18),i=e(256),r=[{path:"/danh-sach-ho-so/:index",component:"Landing",props:!0},{path:"/danh-sach-ho-so/:index/tiep-nhan-ho-so/:id",component:"TiepNhanHoSo",props:!0},{path:"/danh-sach-ho-so/:index/tiep-nhan-ho-so/:id/phieu-hen",component:"PhieuHen",props:!0},{path:"*",component:"NotFound"}],c=r.map(function(t){return s()({},t,{component:function(){return e(261)("./"+t.component+".vue")}})});o.a.use(i.a);var u=new i.a({routes:c});n.a=u},249:function(t,n){},251:function(t,n,e){function a(t){return e(s(t))}function s(t){var n=o[t];if(!(n+1))throw new Error("Cannot find module '"+t+"'.");return n}var o={"./af":53,"./af.js":53,"./ar":60,"./ar-dz":54,"./ar-dz.js":54,"./ar-kw":55,"./ar-kw.js":55,"./ar-ly":56,"./ar-ly.js":56,"./ar-ma":57,"./ar-ma.js":57,"./ar-sa":58,"./ar-sa.js":58,"./ar-tn":59,"./ar-tn.js":59,"./ar.js":60,"./az":61,"./az.js":61,"./be":62,"./be.js":62,"./bg":63,"./bg.js":63,"./bm":64,"./bm.js":64,"./bn":65,"./bn.js":65,"./bo":66,"./bo.js":66,"./br":67,"./br.js":67,"./bs":68,"./bs.js":68,"./ca":69,"./ca.js":69,"./cs":70,"./cs.js":70,"./cv":71,"./cv.js":71,"./cy":72,"./cy.js":72,"./da":73,"./da.js":73,"./de":76,"./de-at":74,"./de-at.js":74,"./de-ch":75,"./de-ch.js":75,"./de.js":76,"./dv":77,"./dv.js":77,"./el":78,"./el.js":78,"./en-au":79,"./en-au.js":79,"./en-ca":80,"./en-ca.js":80,"./en-gb":81,"./en-gb.js":81,"./en-ie":82,"./en-ie.js":82,"./en-il":83,"./en-il.js":83,"./en-nz":84,"./en-nz.js":84,"./eo":85,"./eo.js":85,"./es":88,"./es-do":86,"./es-do.js":86,"./es-us":87,"./es-us.js":87,"./es.js":88,"./et":89,"./et.js":89,"./eu":90,"./eu.js":90,"./fa":91,"./fa.js":91,"./fi":92,"./fi.js":92,"./fo":93,"./fo.js":93,"./fr":96,"./fr-ca":94,"./fr-ca.js":94,"./fr-ch":95,"./fr-ch.js":95,"./fr.js":96,"./fy":97,"./fy.js":97,"./gd":98,"./gd.js":98,"./gl":99,"./gl.js":99,"./gom-latn":100,"./gom-latn.js":100,"./gu":101,"./gu.js":101,"./he":102,"./he.js":102,"./hi":103,"./hi.js":103,"./hr":104,"./hr.js":104,"./hu":105,"./hu.js":105,"./hy-am":106,"./hy-am.js":106,"./id":107,"./id.js":107,"./is":108,"./is.js":108,"./it":109,"./it.js":109,"./ja":110,"./ja.js":110,"./jv":111,"./jv.js":111,"./ka":112,"./ka.js":112,"./kk":113,"./kk.js":113,"./km":114,"./km.js":114,"./kn":115,"./kn.js":115,"./ko":116,"./ko.js":116,"./ky":117,"./ky.js":117,"./lb":118,"./lb.js":118,"./lo":119,"./lo.js":119,"./lt":120,"./lt.js":120,"./lv":121,"./lv.js":121,"./me":122,"./me.js":122,"./mi":123,"./mi.js":123,"./mk":124,"./mk.js":124,"./ml":125,"./ml.js":125,"./mn":126,"./mn.js":126,"./mr":127,"./mr.js":127,"./ms":129,"./ms-my":128,"./ms-my.js":128,"./ms.js":129,"./mt":130,"./mt.js":130,"./my":131,"./my.js":131,"./nb":132,"./nb.js":132,"./ne":133,"./ne.js":133,"./nl":135,"./nl-be":134,"./nl-be.js":134,"./nl.js":135,"./nn":136,"./nn.js":136,"./pa-in":137,"./pa-in.js":137,"./pl":138,"./pl.js":138,"./pt":140,"./pt-br":139,"./pt-br.js":139,"./pt.js":140,"./ro":141,"./ro.js":141,"./ru":142,"./ru.js":142,"./sd":143,"./sd.js":143,"./se":144,"./se.js":144,"./si":145,"./si.js":145,"./sk":146,"./sk.js":146,"./sl":147,"./sl.js":147,"./sq":148,"./sq.js":148,"./sr":150,"./sr-cyrl":149,"./sr-cyrl.js":149,"./sr.js":150,"./ss":151,"./ss.js":151,"./sv":152,"./sv.js":152,"./sw":153,"./sw.js":153,"./ta":154,"./ta.js":154,"./te":155,"./te.js":155,"./tet":156,"./tet.js":156,"./tg":157,"./tg.js":157,"./th":158,"./th.js":158,"./tl-ph":159,"./tl-ph.js":159,"./tlh":160,"./tlh.js":160,"./tr":161,"./tr.js":161,"./tzl":162,"./tzl.js":162,"./tzm":164,"./tzm-latn":163,"./tzm-latn.js":163,"./tzm.js":164,"./ug-cn":165,"./ug-cn.js":165,"./uk":166,"./uk.js":166,"./ur":167,"./ur.js":167,"./uz":169,"./uz-latn":168,"./uz-latn.js":168,"./uz.js":169,"./vi":170,"./vi.js":170,"./x-pseudo":171,"./x-pseudo.js":171,"./yo":172,"./yo.js":172,"./zh-cn":173,"./zh-cn.js":173,"./zh-hk":174,"./zh-hk.js":174,"./zh-tw":175,"./zh-tw.js":175};a.keys=function(){return Object.keys(o)},a.resolve=s,t.exports=a,a.id=251},255:function(t,n){t.exports={render:function(){var t=this,n=t.$createElement,e=t._self._c||n;return e("v-app",[e("v-navigation-drawer",{attrs:{app:"",clipped:"",floating:"",width:"240"}},[e("div",{staticClass:"row-header",staticStyle:{"margin-top":"6px"}},[e("div",{staticClass:"background-triangle-big"},[e("v-icon",{attrs:{dark:"",size:"18"}},[t._v("storage")]),t._v(" Tables ")],1),t._v(" "),e("div",{staticClass:"layout row wrap header_tools row-blue"})]),t._v(" "),t.loading?e("content-placeholders",{staticClass:"mt-3"},[e("content-placeholders-text",{attrs:{lines:7}})],1):e("v-list",{staticClass:"py-0 nav_trang_thai_ho_so"},t._l(t.trangThaiHoSoList,function(n,a){return e("v-list-tile",{key:n.id,on:{click:function(e){t.toTableIndexing(n,a)}}},[e("v-list-tile-action",[a==t.currentIndex?e("v-icon",{attrs:{size:"18",color:"primary"}},[t._v(t._s(n.action_active))]):e("v-icon",{attrs:{size:"18"}},[t._v(t._s(n.action))])],1),t._v(" "),e("v-list-tile-content",[e("v-list-tile-title",{domProps:{textContent:t._s(n.title)}})],1)],1)}))],1),t._v(" "),e("v-content",[e("router-view")],1)],1)},staticRenderFns:[]}},261:function(t,n,e){function a(t){var n=s[t];return n?e.e(n[1]).then(function(){return e(n[0])}):Promise.reject(new Error("Cannot find module '"+t+"'."))}var s={"./Landing.vue":[263,0],"./NotFound.vue":[264,1]};a.keys=function(){return Object.keys(s)},t.exports=a,a.id=261},262:function(t,n){t.exports={renderURLInit:"?p_p_id=FrontEndSuperadmin&p_p_lifecycle=2&p_p_state=exclusive&p_p_mode=view&p_p_resource_id=renderURLInit",trangThaiHoSoList:[{title:"opencps_actionconfig",id:"1",action:"subtitles",action_active:"play_arrow",active:!0,link:"/",desc:"Định nghĩa các thao tác xử lý hồ sơ chuẩn trong hệ thống, dùng làm cơ sở để tạo ra cá dữ liệu DossierAction, DossierSync và DossierDocument"},{title:"opencps_menuconfig",id:"2",action:"subtitles",action_active:"play_arrow",active:!0,link:"/",desc:"Định nghĩa các bước xử lý chuẩn dùng để hiển thị trên menu xử lý của chương trình"},{title:"opencps_stepconfig",id:"3",action:"subtitles",action_active:"play_arrow",active:!0,link:"/",desc:"Định nghĩa các bước xử lý chuẩn dùng để hiển thị trên menu xử lý của chương trình"}],colHeaders:{1:["actionConfigId","actionCode","actionName","extraForm","formScript","sampleData","insideProcess","userNote","syncType","pending","notificationType","createDocument","documentName","documentScript","documentCode"]},columns:{1:[{data:"actionConfigId",type:"numeric",width:40},{data:"actionCode",type:"text"},{data:"actionName",type:"text"},{data:"extraForm",type:"checkbox"},{data:"formScript",type:"text"},{data:"sampleData",type:"text"},{data:"insideProcess",type:"checkbox"},{data:"userNote",type:"text"},{data:"syncType",type:"text"},{data:"pending",type:"checkbox"},{data:"notificationType",type:"text"},{data:"createDocument",type:"checkbox"},{data:"documentName",type:"text"},{data:"documentScript",type:"text"},{data:"documentCode",type:"text"}]}}}},[208]);
//# sourceMappingURL=app.15d9cd897feb251e5c26.js.map