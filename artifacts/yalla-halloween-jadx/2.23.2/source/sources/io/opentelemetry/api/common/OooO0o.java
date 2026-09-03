package io.opentelemetry.api.common;

import android.os.Bundle;
import androidx.media3.common.text.Cue;
import com.google.common.collect.o0O00;
import io.opentelemetry.api.internal.InternalAttributeKeyImpl;
import java.util.ArrayList;
import p080o000OoO.o00oO0o;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class OooO0o implements androidx.media3.common.OooO0OO.OooO00o {
    public static InternalAttributeKeyImpl OooO00o(String str) {
        return new InternalAttributeKeyImpl(AttributeType.BOOLEAN, str);
    }

    public static InternalAttributeKeyImpl OooO0O0(String str) {
        return new InternalAttributeKeyImpl(AttributeType.LONG, str);
    }

    public static InternalAttributeKeyImpl OooO0Oo(String str) {
        return new InternalAttributeKeyImpl(AttributeType.STRING_ARRAY, str);
    }

    public static InternalAttributeKeyImpl OooO0o0(String str) {
        return new InternalAttributeKeyImpl(AttributeType.STRING, str);
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public androidx.media3.common.OooO0OO OooO0OO(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(o000O000.OooO0O0.f33950OooO0oO);
        return new o000O000.OooO0O0(bundle.getLong(o000O000.OooO0O0.f33951OooO0oo), parcelableArrayList == null ? o0O00.f19060OooO0oo : o00oO0o.OooO00o(Cue.f6895Oooo0o, parcelableArrayList));
    }
}
