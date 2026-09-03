package androidx.compose.foundation.text;

import android.content.ComponentName;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.OooO0O0;
import android.text.TextUtils;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.media3.common.OooO0OO;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.session.oo0o0O0;
import kotlinx.coroutines.CoroutineScope;
import p063o0000oO.Oooo0;
import p080o000OoO.o00000O0;
import p080o000OoO.o00Oo0;
import p113o00O00Oo.OooOOOO;
import p113o00O00Oo.OooOo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements OooO0OO.OooO00o, o00000O0.OooO00o {
    public /* synthetic */ OooO00o(AnalyticsListener.OooO00o oooO00o, int i) {
    }

    public static CoroutineScope OooO00o(CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller, Composer composer, int i) {
        CoroutineScope coroutineScope = compositionScopedCoroutineScopeCanceller.getCoroutineScope();
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(i);
        return coroutineScope;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002a  */
    @Override // androidx.media3.common.OooO0OO.OooO00o
    public OooO0OO OooO0OO(Bundle bundle) {
        MediaSessionCompat.Token token;
        Bundle bundle2 = bundle.getBundle(oo0o0O0.f9499OooOO0);
        if (bundle2 == null) {
            token = null;
        } else {
            bundle2.setClassLoader(MediaSessionCompat.Token.class.getClassLoader());
            OooO0O0 oooO0O0OooOOoo = OooO0O0.OooO00o.OooOOoo(Oooo0.OooO00o(bundle2, "android.support.v4.media.session.EXTRA_BINDER"));
            OooOo oooOoOooO00o = OooOOOO.OooO00o(bundle2);
            MediaSessionCompat.Token token2 = (MediaSessionCompat.Token) bundle2.getParcelable("android.support.v4.media.session.TOKEN");
            if (token2 == null) {
                token = null;
            } else {
                token = new MediaSessionCompat.Token(token2.f2111OooO0o0, oooO0O0OooOOoo, oooOoOooO00o);
            }
        }
        String str = oo0o0O0.f9500OooOO0O;
        o00Oo0.OooO0O0(bundle.containsKey(str), "uid should be set.");
        int i = bundle.getInt(str);
        String str2 = oo0o0O0.f9501OooOO0o;
        o00Oo0.OooO0O0(bundle.containsKey(str2), "type should be set.");
        int i2 = bundle.getInt(str2);
        ComponentName componentName = (ComponentName) bundle.getParcelable(oo0o0O0.f9503OooOOO0);
        String string = bundle.getString(oo0o0O0.f9502OooOOO);
        if (TextUtils.isEmpty(string)) {
            throw new IllegalArgumentException("package name should be set.");
        }
        Bundle bundle3 = bundle.getBundle(oo0o0O0.f9504OooOOOO);
        if (bundle3 == null) {
            bundle3 = Bundle.EMPTY;
        }
        return new oo0o0O0(token, i, i2, componentName, string, bundle3);
    }

    @Override // o000OoO.o00000O0.OooO00o
    public void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        analyticsListener.OooOOO0();
        analyticsListener.OooOoo();
    }
}
