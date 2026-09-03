package io.opentelemetry.api.common;

import android.os.Bundle;
import com.google.android.exoplayer2.Oooo000;
import com.google.android.exoplayer2.o00Oo0;
import com.google.android.exoplayer2.o0OO00O;
import com.google.android.exoplayer2.o0Oo0oo;
import com.google.android.exoplayer2.o0ooOOo;
import io.opentelemetry.api.internal.InternalAttributeKeyImpl;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class OooO0o implements com.google.android.exoplayer2.OooO.OooO00o {
    public static InternalAttributeKeyImpl OooO00o(String str) {
        return new InternalAttributeKeyImpl(AttributeType.BOOLEAN, str);
    }

    public static InternalAttributeKeyImpl OooO0OO(String str) {
        return new InternalAttributeKeyImpl(AttributeType.LONG, str);
    }

    public static InternalAttributeKeyImpl OooO0Oo(String str) {
        return new InternalAttributeKeyImpl(AttributeType.STRING_ARRAY, str);
    }

    public static InternalAttributeKeyImpl OooO0o0(String str) {
        return new InternalAttributeKeyImpl(AttributeType.STRING, str);
    }

    @Override // com.google.android.exoplayer2.OooO.OooO00o
    public com.google.android.exoplayer2.OooO OooO0O0(Bundle bundle) {
        int i = bundle.getInt(o0ooOOo.f12867OooO0Oo, -1);
        if (i == 0) {
            return (o0ooOOo) Oooo000.f11330OooOO0.OooO0O0(bundle);
        }
        if (i == 1) {
            return (o0ooOOo) o00Oo0.f12822OooO0oo.OooO0O0(bundle);
        }
        if (i == 2) {
            return (o0ooOOo) o0Oo0oo.f12851OooOO0.OooO0O0(bundle);
        }
        if (i == 3) {
            return (o0ooOOo) o0OO00O.f12844OooOO0.OooO0O0(bundle);
        }
        throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Unknown RatingType: ", i));
    }
}
