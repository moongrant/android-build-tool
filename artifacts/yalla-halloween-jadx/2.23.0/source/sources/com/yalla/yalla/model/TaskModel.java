package com.yalla.yalla.model;

import androidx.annotation.StringRes;
import androidx.compose.foundation.layout.OooO0O0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class TaskModel {
    public String code;
    public List<TaskInfo> data;
    public String message;

    public static class TaskInfo {
        public String getcrystal;
        public int icon;
        public int isonetime;
        public int maxNum;
        public int name;
        public long num = -1;
        public int rewardCoin;
        public int rewardMultiple;
        public int rewardType;
        public int state;
        public int takeid;
        public int typeName;

        public TaskInfo(int i, int i2, @StringRes int i3) {
            this.takeid = i;
            this.icon = i2;
            this.name = i3;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("TaskInfo{takeid=");
            sb.append(this.takeid);
            sb.append(", icon=");
            sb.append(this.icon);
            sb.append(", name=");
            sb.append(this.name);
            sb.append(", getcoin='");
            sb.append(this.getcrystal);
            sb.append("', state=");
            sb.append(this.state);
            sb.append(", num=");
            sb.append(this.num);
            sb.append(", maxNum=");
            sb.append(this.maxNum);
            sb.append(", rewardCoin=");
            sb.append(this.rewardCoin);
            sb.append(", rewardType=");
            sb.append(this.rewardType);
            sb.append(", isonetime=");
            return OooO0O0.OooO00o(sb, this.isonetime, '}');
        }

        public TaskInfo(int i, int i2, @StringRes int i3, int i4) {
            this.takeid = i;
            this.icon = i2;
            this.name = i3;
            this.maxNum = i4;
        }

        public TaskInfo() {
        }
    }
}
