webpackJsonp([23],{223:function(t,e,s){var r=s(137)(s(693),s(700),null,null);r.options.__file="/home/hoanganh/Pictures/FrontEnd_Opencps2.1/frontend-opencps-v2.1/onegate_21_fe/src/components/form_xu_ly/ThongTinChungHoSo.vue",r.esModule&&Object.keys(r.esModule).some(function(t){return"default"!==t&&"__esModule"!==t})&&console.error("named exports are not supported in *.vue files."),r.options.functional&&console.error("[vue-loader] ThongTinChungHoSo.vue: functional components are not supported with templates, they should use render functions."),t.exports=r.exports},693:function(t,e,s){"use strict";Object.defineProperty(e,"__esModule",{value:!0}),e.default={data:function(){return{thongTinChiTietHoSo:{}}},computed:{loading:function(){return this.$store.getters.loading}},created:function(){},methods:{initData:function(t){this.thongTinChiTietHoSo=t},durationText:function(t,e){var s;if(1===t&&e>8){var r=Math.floor(e/8)+" ngày",a=void 0;a=e%8!=0?8*(e/8-Math.floor(e/8))+" giờ":"",s=r+" "+a}else 0===t?s=e+" ngày":1===t&&e<=8&&(s=e+" giờ");return s}},filters:{dateTimeView:function(t){if(t){var e=new Date(t);return e.getDate().toString().padStart(2,"0")+"/"+(e.getMonth()+1).toString().padStart(2,"0")+"/"+e.getFullYear()+"  "+e.getHours().toString().padStart(2,"0")+":"+e.getMinutes().toString().padStart(2,"0")}return""}}}},700:function(t,e,s){t.exports={render:function(){var t=this,e=t.$createElement,s=t._self._c||e;return s("v-card",[s("v-card-text",{staticClass:"pb-0"},[s("v-layout",{attrs:{wrap:""}},[s("v-flex",{attrs:{xs12:"",sm2:""}},[s("v-subheader",{staticClass:"pl-0 text-header"},[t._v("Thủ tục: ")])],1),t._v(" "),s("v-flex",{attrs:{xs12:"",sm10:""}},[s("v-subheader",{staticClass:"pl-0 header-text-field text-header"},[t._v("  "+t._s(t.thongTinChiTietHoSo.serviceName)+" ")])],1),t._v(" "),s("v-flex",{attrs:{xs12:"",sm2:""}},[s("v-subheader",{staticClass:"pl-0 text-header"},[t._v("Mã số hồ sơ: ")])],1),t._v(" "),s("v-flex",{attrs:{xs12:"",sm4:""}},[s("v-subheader",{staticClass:"pl-0 text-header header-text-field"},[t._v("  "+t._s(t.thongTinChiTietHoSo.dossierNo)+" ")])],1),t._v(" "),s("v-flex",{attrs:{xs12:"",sm2:""}},[s("v-subheader",{staticClass:"pl-0 text-header"},[t._v("Thời hạn giải quyết: ")])],1),t._v(" "),s("v-flex",{attrs:{xs12:"",sm4:""}},[s("v-subheader",{staticClass:"pl-0 text-header header-text-field"},[t._v("  "+t._s(t.durationText(t.thongTinChiTietHoSo.durationUnit,t.thongTinChiTietHoSo.durationCount))+" làm việc  ")])],1),t._v(" "),s("v-flex",{attrs:{xs12:"",sm2:""}},[s("v-subheader",{staticClass:"pl-0 text-header"},[t._v("Ngày tiếp nhận: ")])],1),t._v(" "),s("v-flex",{attrs:{xs12:"",sm4:""}},[s("v-subheader",{staticClass:"pl-0 text-header header-text-field"},[t._v("  "+t._s(t.thongTinChiTietHoSo.receiveDate)+" ")])],1),t._v(" "),s("v-flex",{attrs:{xs12:"",sm2:""}},[s("v-subheader",{staticClass:"pl-0 text-header"},[t._v("Ngày hẹn trả: ")])],1),t._v(" "),s("v-flex",{attrs:{xs12:"",sm4:""}},[s("v-subheader",{staticClass:"pl-0 text-header header-text-field"},[t._v("  "+t._s(t.thongTinChiTietHoSo.dueDate)+" ")])],1)],1)],1)],1)},staticRenderFns:[]},t.exports.render._withStripped=!0}});
//# sourceMappingURL=23.032cb6fd9a4fa6b68e20.js.map