package p097o000o0oO;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.content.ContextCompat;
import coil.memory.MemoryCache;
import com.zego.zegoliveroom.constants.ZegoConstants;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import p108o000ooOO.o000O;
import p108o000ooOO.o000O0Oo;
import p108o000ooOO.o000OO00;
import p321o0O0ooO.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O extends Lambda implements Function0<MemoryCache> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O000.OooO00o f35394OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O(o000O000.OooO00o oooO00o) {
        super(0);
        this.f35394OooO0Oo = oooO00o;
    }

    @Override // kotlin.jvm.functions.Function0
    public final MemoryCache invoke() {
        double d;
        int largeMemoryClass;
        Context context = this.f35394OooO0Oo.f35419OooO00o;
        Bitmap.Config[] configArr = o000O0O0.f42845OooO00o;
        try {
            Object obj = ContextCompat.f5271OooO00o;
            Object objOooO0O0 = ContextCompat.OooO0o.OooO0O0(context, ActivityManager.class);
            Intrinsics.checkNotNull(objOooO0O0);
            d = ((ActivityManager) objOooO0O0).isLowRamDevice() ? 0.15d : 0.2d;
        } catch (Exception unused) {
        }
        o000OO00 o000oo01 = new o000OO00();
        int i = 0;
        if (d > 0.0d) {
            Bitmap.Config[] configArr2 = o000O0O0.f42845OooO00o;
            try {
                Object obj2 = ContextCompat.f5271OooO00o;
                Object objOooO0O1 = ContextCompat.OooO0o.OooO0O0(context, ActivityManager.class);
                Intrinsics.checkNotNull(objOooO0O1);
                ActivityManager activityManager = (ActivityManager) objOooO0O1;
                largeMemoryClass = ((context.getApplicationInfo().flags & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? 1 : 0) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
            } catch (Exception unused2) {
                largeMemoryClass = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
            double d2 = d * ((double) largeMemoryClass);
            double d3 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            i = (int) (d2 * d3 * d3);
        }
        return new p108o000ooOO.o000O0O0(i > 0 ? new o000O(i, o000oo01) : new o000O0Oo(o000oo01), o000oo01);
    }
}
