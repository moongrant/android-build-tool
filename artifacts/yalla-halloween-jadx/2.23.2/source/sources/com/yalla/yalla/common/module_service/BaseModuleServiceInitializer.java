package com.yalla.yalla.common.module_service;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o00O000o.OooO0O0;
import org.jetbrains.annotations.NotNull;
import p569o0oOo0o0.o00000;
import p569o0oOo0o0.o000000;
import p569o0oOo0o0.o000000O;
import p569o0oOo0o0.o00000O;
import p569o0oOo0o0.o00000O0;
import p569o0oOo0o0.o00000OO;
import p569o0oOo0o0.o000OOo;
import p569o0oOo0o0.o0O0O00;
import p569o0oOo0o0.o0OO00O;
import p569o0oOo0o0.o0OOO0o;
import p569o0oOo0o0.o0Oo0oo;
import p569o0oOo0o0.o0ooOOo;
import p569o0oOo0o0.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/common/module_service/BaseModuleServiceInitializer;", "Lo00O000o/OooO0O0;", "", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public abstract class BaseModuleServiceInitializer implements OooO0O0<Object> {
    @NotNull
    public abstract Object OooO00o();

    public abstract void OooO0O0();

    @Override // o00O000o.OooO0O0
    @NotNull
    public final Object create(@NotNull Context context) throws Exception {
        Intrinsics.checkNotNullParameter(context, "context");
        OooO0O0();
        Object objOooO00o = OooO00o();
        if (objOooO00o instanceof o0ooOOo) {
            o0ooOOo o0ooooo = (o0ooOOo) objOooO00o;
            Intrinsics.checkNotNullParameter(o0ooooo, "<set-?>");
            o00000OO.f56398OooO00o = o0ooooo;
        } else if (objOooO00o instanceof o0OOO0o) {
            o0OOO0o o0ooo0o2 = (o0OOO0o) objOooO00o;
            Intrinsics.checkNotNullParameter(o0ooo0o2, "<set-?>");
            o00000OO.f56399OooO0O0 = o0ooo0o2;
        } else if (objOooO00o instanceof o0Oo0oo) {
            o0Oo0oo o0oo0oo2 = (o0Oo0oo) objOooO00o;
            Intrinsics.checkNotNullParameter(o0oo0oo2, "<set-?>");
            o00000OO.f56400OooO0OO = o0oo0oo2;
        } else if (objOooO00o instanceof o0OO00O) {
            o0OO00O o0oo00o2 = (o0OO00O) objOooO00o;
            Intrinsics.checkNotNullParameter(o0oo00o2, "<set-?>");
            o00000OO.f56401OooO0Oo = o0oo00o2;
        } else if (objOooO00o instanceof oo0o0Oo) {
            oo0o0Oo oo0o0oo = (oo0o0Oo) objOooO00o;
            Intrinsics.checkNotNullParameter(oo0o0oo, "<set-?>");
            o00000OO.f56403OooO0o0 = oo0o0oo;
        } else if (objOooO00o instanceof o0O0O00) {
            o0O0O00 o0o0o00 = (o0O0O00) objOooO00o;
            Intrinsics.checkNotNullParameter(o0o0o00, "<set-?>");
            o00000OO.f56402OooO0o = o0o0o00;
        } else if (objOooO00o instanceof o000OOo) {
            o000OOo o000ooo2 = (o000OOo) objOooO00o;
            Intrinsics.checkNotNullParameter(o000ooo2, "<set-?>");
            o00000OO.f56404OooO0oO = o000ooo2;
        } else if (objOooO00o instanceof o000000) {
            o000000 o000000Var = (o000000) objOooO00o;
            Intrinsics.checkNotNullParameter(o000000Var, "<set-?>");
            o00000OO.f56405OooO0oo = o000000Var;
        } else if (objOooO00o instanceof o000000O) {
            o000000O o000000o2 = (o000000O) objOooO00o;
            Intrinsics.checkNotNullParameter(o000000o2, "<set-?>");
            o00000OO.f56397OooO = o000000o2;
        } else if (objOooO00o instanceof o00000) {
            o00000 o00000Var = (o00000) objOooO00o;
            Intrinsics.checkNotNullParameter(o00000Var, "<set-?>");
            o00000OO.f56406OooOO0 = o00000Var;
        } else if (objOooO00o instanceof o00000O0) {
            o00000O0 o00000o1 = (o00000O0) objOooO00o;
            Intrinsics.checkNotNullParameter(o00000o1, "<set-?>");
            o00000OO.f56407OooOO0O = o00000o1;
        } else {
            if (!(objOooO00o instanceof o00000O)) {
                throw new Exception("只能使用上述类型，如果是新增模块请在上面添加适配");
            }
            o00000O o00000o = (o00000O) objOooO00o;
            Intrinsics.checkNotNullParameter(o00000o, "<set-?>");
            o00000OO.f56408OooOO0o = o00000o;
        }
        return Boolean.TRUE;
    }

    @Override // o00O000o.OooO0O0
    @NotNull
    public final List<Class<? extends OooO0O0<?>>> dependencies() {
        return CollectionsKt.emptyList();
    }
}
