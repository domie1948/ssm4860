<template>
  <div>
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      label-width="80px"
    >  
     <el-row>
                              <el-col :span="12">
        <el-form-item   v-if="flag=='bingren'"  label="账号" prop="zhanghao">
          <el-input v-model="ruleForm.zhanghao" readonly              placeholder="账号" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='bingren'"  label="姓名" prop="xingming">
          <el-input v-model="ruleForm.xingming"               placeholder="姓名" clearable></el-input>
        </el-form-item>
      </el-col>
                                          <el-col :span="12">
        <el-form-item v-if="flag=='bingren'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie" placeholder="请选择性别">
            <el-option
                v-for="(item,index) in bingrenxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='bingren'"  label="身高CM" prop="shengaoCM">
          <el-input v-model="ruleForm.shengaoCM"               placeholder="身高CM" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='bingren'"  label="出生" prop="chusheng">
          <el-input v-model="ruleForm.chusheng"               placeholder="出生" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='bingren'"  label="年龄" prop="nianling">
          <el-input v-model="ruleForm.nianling"               placeholder="年龄" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='bingren'"  label="体重KG" prop="tizhongKG">
          <el-input v-model="ruleForm.tizhongKG"               placeholder="体重KG" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='bingren'"  label="籍贯" prop="jiguan">
          <el-input v-model="ruleForm.jiguan"               placeholder="籍贯" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item v-if="flag=='bingren'"  label="居住地" prop="juzhudi">
          <el-select v-model="ruleForm.juzhudi" placeholder="请选择居住地">
            <el-option
                v-for="(item,index) in bingrenjuzhudiOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='bingren'"  label="职业" prop="zhiye">
          <el-input v-model="ruleForm.zhiye"               placeholder="职业" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='bingren'"  label="手机" prop="shouji">
          <el-input v-model="ruleForm.shouji"               placeholder="手机" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="24">  
        <el-form-item v-if="flag=='bingren'" label="病人照片" prop="bingrenzhaopian">
          <file-upload
          tip="点击上传病人照片"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.bingrenzhaopian?ruleForm.bingrenzhaopian:''"
          @change="bingrenbingrenzhaopianUploadChange"
          ></file-upload>
        </el-form-item>
      </el-col>
                                                                                                                                                      <el-form-item v-if="flag=='users'" label="用户名" prop="username">
        <el-input v-model="ruleForm.username" 
        placeholder="用户名"></el-input>
      </el-form-item>
      <el-col :span="24">
      <el-form-item>
        <el-button type="primary" @click="onUpdateHandler">修 改</el-button>
      </el-form-item>
      </el-col>
      </el-row>
    </el-form>
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isMobile,isPhone,isURL,checkIdCard } from "@/utils/validate";

export default {
  data() {
    return {
      ruleForm: {},
      flag: '',
      usersFlag: false,
                                                                  bingrenxingbieOptions: [],
                                                                                    bingrenjuzhudiOptions: [],
                                                                                                                                                                                        };
  },
  mounted() {
    var table = this.$storage.get("sessionTable");
    this.flag = table;
    this.$http({
      url: `${this.$storage.get("sessionTable")}/session`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.ruleForm = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
                                            this.bingrenxingbieOptions = "男,女".split(',')
                                                        this.bingrenjuzhudiOptions = "城镇,农村".split(',')
                                                                                                                          },
  methods: {
                                                                                                                                                                                                                                                                                                                                bingrenbingrenzhaopianUploadChange(fileUrls) {
        this.ruleForm.bingrenzhaopian = fileUrls;
    },
                                                                                                    onUpdateHandler() {
                              if((!this.ruleForm.zhanghao)&& 'bingren'==this.flag){
        this.$message.error('账号不能为空');
        return
      }
                                                                  if((!this.ruleForm.xingming)&& 'bingren'==this.flag){
        this.$message.error('姓名不能为空');
        return
      }
                                                                  if((!this.ruleForm.mima)&& 'bingren'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
                                                                                                                              if( 'bingren' ==this.flag && this.ruleForm.shengaoCM&&(!isIntNumer(this.ruleForm.shengaoCM))){
       this.$message.error(`身高CM应输入整数`);
        return
      }
                                                                                                                        if( 'bingren' ==this.flag && this.ruleForm.nianling&&(!isIntNumer(this.ruleForm.nianling))){
       this.$message.error(`年龄应输入整数`);
        return
      }
                                                                  if( 'bingren' ==this.flag && this.ruleForm.tizhongKG&&(!isIntNumer(this.ruleForm.tizhongKG))){
       this.$message.error(`体重KG应输入整数`);
        return
      }
                                                                                                                                                                                                                                                      if( 'bingren' ==this.flag && this.ruleForm.shouji&&(!isMobile(this.ruleForm.shouji))){
        this.$message.error(`手机应输入手机格式`);
        return
      }
                                                                                                                                                                                                                              this.$http({
        url: `${this.$storage.get("sessionTable")}/update`,
        method: "post",
        data: this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "修改信息成功",
            type: "success",
            duration: 1500,
            onClose: () => {
            }
          });
        } else {
          this.$message.error(data.msg);
        }
      });
    }
  }
};
</script>
<style lang="scss" scoped>
</style>
