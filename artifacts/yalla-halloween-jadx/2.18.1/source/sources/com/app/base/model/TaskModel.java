package com.app.base.model;

import OooO00o.OooO00o;
import androidx.annotation.StringRes;
import java.util.List;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public class TaskModel {

    /* JADX INFO: renamed from: code, reason: collision with root package name */
    public String f11893code;
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
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("TaskInfo{takeid=");
            sbOooO0o0.append(this.takeid);
            sbOooO0o0.append(", icon=");
            sbOooO0o0.append(this.icon);
            sbOooO0o0.append(", name=");
            sbOooO0o0.append(this.name);
            sbOooO0o0.append(", getcoin='");
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.getcrystal, '\'', ", state=");
            sbOooO0o0.append(this.state);
            sbOooO0o0.append(", num=");
            sbOooO0o0.append(this.num);
            sbOooO0o0.append(", maxNum=");
            sbOooO0o0.append(this.maxNum);
            sbOooO0o0.append(", rewardCoin=");
            sbOooO0o0.append(this.rewardCoin);
            sbOooO0o0.append(", rewardType=");
            sbOooO0o0.append(this.rewardType);
            sbOooO0o0.append(", isonetime=");
            return o0O0ooO.OooO00o(sbOooO0o0, this.isonetime, '}');
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
