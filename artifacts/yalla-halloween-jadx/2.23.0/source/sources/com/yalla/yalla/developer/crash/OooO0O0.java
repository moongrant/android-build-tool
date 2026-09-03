package com.yalla.yalla.developer.crash;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Looper;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f23356OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(String str) {
        super(0);
        this.f23356OooO0Oo = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((ClipboardManager) o000O0.f10354OooO00o.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(o000O0.f10354OooO00o.getPackageName(), this.f23356OooO0Oo));
        if (!StringsKt.isBlank("copy success")) {
            o000Oo0 o000oo0OooO00o = o000O00.OooO00o("copy success", "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
            }
        }
        return Unit.INSTANCE;
    }
}
