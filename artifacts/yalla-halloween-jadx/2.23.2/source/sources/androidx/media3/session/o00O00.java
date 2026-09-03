package androidx.media3.session;

import android.os.Bundle;
import android.util.JsonReader;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import com.google.android.gms.measurement.internal.zzgd;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o00O00 implements androidx.media3.common.OooO0OO.OooO00o, o0O0Oo.OooO0O0.OooO00o {
    public static void OooO00o(zzgd zzgdVar, String str) {
        zzgdVar.zzaA().zzd().zza(str);
    }

    @Override // o0O0Oo.OooO0O0.OooO00o
    public Object OooO0O0(JsonReader jsonReader) {
        return p288o0O0Oo.OooO0O0.OooO0O0(jsonReader);
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public androidx.media3.common.OooO0OO OooO0OO(Bundle bundle) {
        PlaybackException playbackException;
        Bundle bundle2 = bundle.getBundle(o00O00O.f9350OoooOoo);
        if (bundle2 == null) {
            playbackException = null;
        } else {
            PlaybackException.f6697OooOO0O.getClass();
            playbackException = new PlaybackException(bundle2);
        }
        int i = bundle.getInt(o00O00O.f9352Ooooo0o, 0);
        Bundle bundle3 = bundle.getBundle(o00O00O.f9351Ooooo00);
        o00O0O00 o00o0o01 = bundle3 == null ? o00O0O00.f9434OooOOOO : (o00O0O00) o00O0O00.f9444OooOoO.OooO0OO(bundle3);
        Bundle bundle4 = bundle.getBundle(o00O00O.f9353OooooO0);
        Player.OooO0o oooO0o = bundle4 == null ? o00O0O00.f9433OooOOO : (Player.OooO0o) Player.OooO0o.f6714OooOo00.OooO0OO(bundle4);
        Bundle bundle5 = bundle.getBundle(o00O00O.f9354OooooOO);
        Player.OooO0o oooO0o2 = bundle5 == null ? o00O0O00.f9433OooOOO : (Player.OooO0o) Player.OooO0o.f6714OooOo00.OooO0OO(bundle5);
        int i2 = bundle.getInt(o00O00O.f9355OooooOo, 0);
        Bundle bundle6 = bundle.getBundle(o00O00O.f9335Oooo0O0);
        androidx.media3.common.OooOOOO oooOOOO = bundle6 == null ? androidx.media3.common.OooOOOO.f6616OooO0oO : (androidx.media3.common.OooOOOO) androidx.media3.common.OooOOOO.f6618OooOO0.OooO0OO(bundle6);
        int i3 = bundle.getInt(o00O00O.f9336Oooo0OO, 0);
        boolean z = bundle.getBoolean(o00O00O.f9338Oooo0o0, false);
        Bundle bundle7 = bundle.getBundle(o00O00O.f9337Oooo0o);
        androidx.media3.common.Oooo0 oooo0 = bundle7 == null ? androidx.media3.common.Oooo0.f6629OooO0Oo : (androidx.media3.common.Oooo0) androidx.media3.common.Oooo0.f6633OooO0oo.OooO0OO(bundle7);
        int i4 = bundle.getInt(o00O00O.f9362o00Oo0, 0);
        Bundle bundle8 = bundle.getBundle(o00O00O.f9339Oooo0oO);
        androidx.media3.common.o00Ooo o00ooo2 = bundle8 == null ? androidx.media3.common.o00Ooo.f6864OooO0oo : (androidx.media3.common.o00Ooo) androidx.media3.common.o00Ooo.f6868OooOOO0.OooO0OO(bundle8);
        Bundle bundle9 = bundle.getBundle(o00O00O.f9340Oooo0oo);
        MediaMetadata mediaMetadata = bundle9 == null ? MediaMetadata.f6236Oooo0o0 : (MediaMetadata) MediaMetadata.f6263o00oO0O.OooO0OO(bundle9);
        float f = bundle.getFloat(o00O00O.f9333Oooo, 1.0f);
        Bundle bundle10 = bundle.getBundle(o00O00O.f9343OoooO00);
        androidx.media3.common.OooO00o oooO00o = bundle10 == null ? androidx.media3.common.OooO00o.f6341OooOO0 : (androidx.media3.common.OooO00o) androidx.media3.common.OooO00o.f6347OooOOOo.OooO0OO(bundle10);
        Bundle bundle11 = bundle.getBundle(o00O00O.f9357Oooooo0);
        o000O000.OooO0O0 oooO0O0 = bundle11 == null ? o000O000.OooO0O0.f33949OooO0o : (o000O000.OooO0O0) o000O000.OooO0O0.f33948OooO.OooO0OO(bundle11);
        Bundle bundle12 = bundle.getBundle(o00O00O.f9342OoooO0);
        DeviceInfo deviceInfo = bundle12 == null ? DeviceInfo.f6212OooO0oo : (DeviceInfo) DeviceInfo.f6216OooOOO0.OooO0OO(bundle12);
        int i5 = bundle.getInt(o00O00O.f9344OoooO0O, 0);
        boolean z2 = bundle.getBoolean(o00O00O.f9341OoooO, false);
        boolean z3 = bundle.getBoolean(o00O00O.f9345OoooOO0, false);
        int i6 = bundle.getInt(o00O00O.f9360o000oOoO, 1);
        int i7 = bundle.getInt(o00O00O.f9346OoooOOO, 0);
        int i8 = bundle.getInt(o00O00O.f9347OoooOOo, 1);
        boolean z4 = bundle.getBoolean(o00O00O.f9348OoooOo0, false);
        boolean z5 = bundle.getBoolean(o00O00O.f9349OoooOoO, false);
        Bundle bundle13 = bundle.getBundle(o00O00O.f9356Oooooo);
        MediaMetadata mediaMetadata2 = bundle13 == null ? MediaMetadata.f6236Oooo0o0 : (MediaMetadata) MediaMetadata.f6263o00oO0O.OooO0OO(bundle13);
        long j = bundle.getLong(o00O00O.f9358OoooooO, 0L);
        long j2 = bundle.getLong(o00O00O.f9359Ooooooo, 0L);
        long j3 = bundle.getLong(o00O00O.f9364o0OoOo0, 0L);
        Bundle bundle14 = bundle.getBundle(o00O00O.f9361o00O0O);
        androidx.media3.common.o00Oo0 o00oo1 = bundle14 == null ? androidx.media3.common.o00Oo0.f6850OooO0o0 : (androidx.media3.common.o00Oo0) androidx.media3.common.o00Oo0.f6851OooO0oO.OooO0OO(bundle14);
        Bundle bundle15 = bundle.getBundle(o00O00O.f9365ooOO);
        return new o00O00O(playbackException, i, o00o0o01, oooO0o, oooO0o2, i2, oooOOOO, i3, z, o00ooo2, oooo0, i4, mediaMetadata, f, oooO00o, oooO0O0, deviceInfo, i5, z2, z3, i6, i7, i8, z4, z5, mediaMetadata2, j, j2, j3, o00oo1, bundle15 == null ? androidx.media3.common.o00O0O.f6770OooOooO : new androidx.media3.common.o00O0O(new androidx.media3.common.o00O0O.OooO00o(bundle15)));
    }
}
