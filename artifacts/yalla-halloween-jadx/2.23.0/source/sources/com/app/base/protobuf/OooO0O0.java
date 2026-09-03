package com.app.base.protobuf;

import android.animation.ValueAnimator;
import android.net.Uri;
import android.view.View;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.material.internal.OooOOOO;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.LazyStringList;
import java.util.Map;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.functions.Function1;
import p209o00o0oo0.o00O0OO0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OooO0O0 implements o00O0OO0, OooOOOO.OooO00o {
    public static int OooO0Oo(LazyStringList lazyStringList, int i, int i2) {
        return GeneratedMessageV3.computeStringSizeNoTag(lazyStringList.getRaw(i)) + i2;
    }

    public static Object OooO0o0(short[] sArr, int i, Function1 function1) {
        return function1.invoke(UShort.m4488boximpl(UShortArray.m4552getMh2AYeg(sArr, i)));
    }

    @Override // p209o00o0oo0.o00O0OO0
    public Extractor[] OooO00o(Uri uri, Map map) {
        return OooO0O0();
    }

    public Extractor[] OooO0O0() {
        return new Extractor[0];
    }

    @Override // com.google.android.material.internal.OooOOOO.OooO00o
    public void OooO0OO(ValueAnimator valueAnimator, View view) {
        view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
