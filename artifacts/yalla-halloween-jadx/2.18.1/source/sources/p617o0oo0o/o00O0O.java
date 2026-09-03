package p617o0oo0o;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bumptech.glide.OooO0OO;
import com.bumptech.glide.OooOOO0;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000OO00;
import p254o00ooO0O.o00O000;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00O0O f48558OooO00o = new o00O0O();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Map<String, NinePatchDrawable> f48559OooO0O0 = new LinkedHashMap();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, android.graphics.drawable.NinePatchDrawable>] */
    @Nullable
    public final Object OooO00o(@NotNull String str, @NotNull Continuation continuation) {
        o0OoOo0 o0oooo1;
        o00O0O o00o0o2;
        if (continuation instanceof o0OoOo0) {
            o0oooo1 = (o0OoOo0) continuation;
            int i = o0oooo1.f48581OoooO00;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0oooo1.f48581OoooO00 = i - Integer.MIN_VALUE;
            } else {
                o0oooo1 = new o0OoOo0(this, continuation);
            }
        } else {
            o0oooo1 = new o0OoOo0(this, continuation);
        }
        Object result = o0oooo1.f48580Oooo0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o0oooo1.f48581OoooO00;
        if (i2 == 0) {
            ResultKt.throwOnFailure(result);
            ?? r14 = f48559OooO0O0;
            NinePatchDrawable ninePatchDrawable = (NinePatchDrawable) r14.get(str);
            if (Intrinsics.areEqual(ninePatchDrawable != null ? Oooo0.OooO00o(ninePatchDrawable) : null, "")) {
                return (NinePatchDrawable) r14.get(str);
            }
            o0oooo1.f48578Oooo0o = this;
            o0oooo1.f48579Oooo0oO = str;
            o0oooo1.f48581OoooO00 = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(o0oooo1), 1);
            cancellableContinuationImpl.initCancellability();
            o00O000 o00o001 = o00O000.f34346OooO00o;
            OooOOO0<Bitmap> oooOOO0OoooO = OooO0OO.OooO(o00O000.OooO00o()).OooO0O0().OoooO(CloudImageUtilKt.imgFormat(str) + "?imageMogr2/thumbnail/" + o000OO00.OooO00o(58) + 'x' + o000OO00.OooO00o((float) 55.5d));
            oooOOO0OoooO.Oooo0o(new o000oOoO(cancellableContinuationImpl), oooOOO0OoooO);
            result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(o0oooo1);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
            o00o0o2 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = o0oooo1.f48579Oooo0oO;
            o00o0o2 = o0oooo1.f48578Oooo0o;
            ResultKt.throwOnFailure(result);
        }
        Bitmap bitmap = (Bitmap) result;
        if (bitmap == null) {
            return null;
        }
        Objects.requireNonNull(o00o0o2);
        o00O000 o00o002 = o00O000.f34346OooO00o;
        Resources resources = o00O000.OooO00o().getResources();
        o00O000.OooO00o().getResources();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f = 24;
        int iOooO00o = o000OO00.OooO00o(f);
        float f2 = 2;
        int iOooO00o2 = o000OO00.OooO00o(f2);
        arrayList.add(Integer.valueOf(iOooO00o));
        arrayList.add(Integer.valueOf(iOooO00o + iOooO00o2));
        int iOooO00o3 = o000OO00.OooO00o(f);
        int iOooO00o4 = o000OO00.OooO00o(f2);
        arrayList2.add(Integer.valueOf(iOooO00o3));
        arrayList2.add(Integer.valueOf(iOooO00o3 + iOooO00o4));
        if (arrayList.size() == 0) {
            arrayList.add(0);
            arrayList.add(Integer.valueOf(width));
        }
        if (arrayList2.size() == 0) {
            arrayList2.add(0);
            arrayList2.add(Integer.valueOf(height));
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate((arrayList2.size() + arrayList.size() + 8 + 9) * 4).order(ByteOrder.nativeOrder());
        byteBufferOrder.put((byte) 1);
        byteBufferOrder.put((byte) arrayList.size());
        byteBufferOrder.put((byte) arrayList2.size());
        byteBufferOrder.put((byte) 9);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byteBufferOrder.putInt(((Integer) it.next()).intValue());
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            byteBufferOrder.putInt(((Integer) it2.next()).intValue());
        }
        for (int i3 = 0; i3 < 9; i3++) {
            byteBufferOrder.putInt(1);
        }
        NinePatchDrawable ninePatchDrawable2 = new NinePatchDrawable(resources, bitmap, byteBufferOrder.array(), new Rect(), null);
        ninePatchDrawable2.setAutoMirrored(true);
        f48559OooO0O0.put(str, ninePatchDrawable2);
        return ninePatchDrawable2;
    }
}
