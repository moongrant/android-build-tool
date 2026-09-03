package p022Oooo00O;

import android.content.Context;
import android.media.CamcorderProfile;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.impl.o0ooOOo;
import java.util.HashMap;
import java.util.Set;
import p023Oooo00o.oO00o000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00O00o0 implements o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f610OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOOO0 f611OooO0O0;

    public class OooO00o implements OooOOO0 {
        @Override // p022Oooo00O.OooOOO0
        public final CamcorderProfile OooO00o(int i, int i2) {
            return CamcorderProfile.get(i, i2);
        }

        @Override // p022Oooo00O.OooOOO0
        public final boolean OooO0O0(int i, int i2) {
            return CamcorderProfile.hasProfile(i, i2);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public o00O00o0(@NonNull Context context, @Nullable Object obj, @NonNull Set<String> set) throws CameraUnavailableException {
        OooO00o oooO00o = new OooO00o();
        this.f610OooO00o = new HashMap();
        this.f611OooO0O0 = oooO00o;
        oO00o000 oo00o000OooO00o = obj instanceof oO00o000 ? (oO00o000) obj : oO00o000.OooO00o(context, p031OoooO0.o0ooOOo.OooO00o());
        context.getClass();
        for (String str : set) {
            this.f610OooO00o.put(str, new o0O0O0O(context, str, oo00o000OooO00o, this.f611OooO0O0));
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 35831. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @androidx.annotation.NonNull
    public final android.util.Pair OooO00o(int r38, @androidx.annotation.NonNull java.lang.String r39, @androidx.annotation.NonNull java.util.ArrayList r40, @androidx.annotation.NonNull java.util.HashMap r41) {
        /*
            Method dump skipped, instruction units count: 3583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p022Oooo00O.o00O00o0.OooO00o(int, java.lang.String, java.util.ArrayList, java.util.HashMap):android.util.Pair");
    }
}
