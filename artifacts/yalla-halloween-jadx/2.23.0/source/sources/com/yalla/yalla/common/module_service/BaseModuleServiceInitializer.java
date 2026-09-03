package com.yalla.yalla.common.module_service;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o000OOo0.OooO0O0;
import org.jetbrains.annotations.NotNull;
import p560o0oOo000.o0000;
import p560o0oOo000.o00000;
import p560o0oOo000.o00000O;
import p560o0oOo000.o00000O0;
import p560o0oOo000.o00000OO;
import p560o0oOo000.o0000O;
import p560o0oOo000.o0000O0;
import p560o0oOo000.o0000O00;
import p560o0oOo000.o0000O0O;
import p560o0oOo000.o0000OO0;
import p560o0oOo000.o0000Ooo;
import p560o0oOo000.o0000oo;
import p560o0oOo000.o000OO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/common/module_service/BaseModuleServiceInitializer;", "Lo000OOo0/OooO0O0;", "", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public abstract class BaseModuleServiceInitializer implements OooO0O0<Object> {
    @NotNull
    public abstract Object OooO00o();

    public abstract void OooO0O0();

    @Override // o000OOo0.OooO0O0
    @NotNull
    public final Object create(@NotNull Context context) throws Exception {
        Intrinsics.checkNotNullParameter(context, "context");
        OooO0O0();
        Object objOooO00o = OooO00o();
        if (objOooO00o instanceof o00000) {
            o00000 o00000Var = (o00000) objOooO00o;
            Intrinsics.checkNotNullParameter(o00000Var, "<set-?>");
            o0000OO0.f56182OooO00o = o00000Var;
        } else if (objOooO00o instanceof o00000O0) {
            o00000O0 o00000o1 = (o00000O0) objOooO00o;
            Intrinsics.checkNotNullParameter(o00000o1, "<set-?>");
            o0000OO0.f56183OooO0O0 = o00000o1;
        } else if (objOooO00o instanceof o00000O) {
            o00000O o00000o = (o00000O) objOooO00o;
            Intrinsics.checkNotNullParameter(o00000o, "<set-?>");
            o0000OO0.f56184OooO0OO = o00000o;
        } else if (objOooO00o instanceof o00000OO) {
            o00000OO o00000oo2 = (o00000OO) objOooO00o;
            Intrinsics.checkNotNullParameter(o00000oo2, "<set-?>");
            o0000OO0.f56185OooO0Oo = o00000oo2;
        } else if (objOooO00o instanceof o0000Ooo) {
            o0000Ooo o0000ooo = (o0000Ooo) objOooO00o;
            Intrinsics.checkNotNullParameter(o0000ooo, "<set-?>");
            o0000OO0.f56187OooO0o0 = o0000ooo;
        } else if (objOooO00o instanceof o0000) {
            o0000 o0000Var = (o0000) objOooO00o;
            Intrinsics.checkNotNullParameter(o0000Var, "<set-?>");
            o0000OO0.f56186OooO0o = o0000Var;
        } else if (objOooO00o instanceof o0000O00) {
            o0000O00 o0000o00 = (o0000O00) objOooO00o;
            Intrinsics.checkNotNullParameter(o0000o00, "<set-?>");
            o0000OO0.f56188OooO0oO = o0000o00;
        } else if (objOooO00o instanceof o0000oo) {
            o0000oo o0000ooVar = (o0000oo) objOooO00o;
            Intrinsics.checkNotNullParameter(o0000ooVar, "<set-?>");
            o0000OO0.f56189OooO0oo = o0000ooVar;
        } else if (objOooO00o instanceof o0000O0) {
            o0000O0 o0000o1 = (o0000O0) objOooO00o;
            Intrinsics.checkNotNullParameter(o0000o1, "<set-?>");
            o0000OO0.f56181OooO = o0000o1;
        } else if (objOooO00o instanceof o0000O0O) {
            o0000O0O o0000o0o2 = (o0000O0O) objOooO00o;
            Intrinsics.checkNotNullParameter(o0000o0o2, "<set-?>");
            o0000OO0.f56190OooOO0 = o0000o0o2;
        } else if (objOooO00o instanceof o000OO) {
            o000OO o000oo2 = (o000OO) objOooO00o;
            Intrinsics.checkNotNullParameter(o000oo2, "<set-?>");
            o0000OO0.f56191OooOO0O = o000oo2;
        } else {
            if (!(objOooO00o instanceof o0000O)) {
                throw new Exception("只能使用上述类型，如果是新增模块请在上面添加适配");
            }
            o0000O o0000o2 = (o0000O) objOooO00o;
            Intrinsics.checkNotNullParameter(o0000o2, "<set-?>");
            o0000OO0.f56192OooOO0o = o0000o2;
        }
        return Boolean.TRUE;
    }

    @Override // o000OOo0.OooO0O0
    @NotNull
    public final List<Class<? extends OooO0O0<?>>> dependencies() {
        return CollectionsKt.emptyList();
    }
}
