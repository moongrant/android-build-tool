package p590o0oOooo0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bumptech.glide.OooO0OO;
import com.bumptech.glide.OooOOOO;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O00O;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p174o00OooOo.o00O0OO0;
import p423o0OoO0OO.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nBubbleUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BubbleUtil.kt\ncom/yalla/yalla/util/BubbleUtil\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,67:1\n314#2,11:68\n*S KotlinDebug\n*F\n+ 1 BubbleUtil.kt\ncom/yalla/yalla/util/BubbleUtil\n*L\n47#1:68,11\n*E\n"})
public final class oOO00O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oOO00O0 f57177OooO00o = new oOO00O0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final LinkedHashMap f57178OooO0O0 = new LinkedHashMap();

    @DebugMetadata(c = "com.yalla.yalla.util.BubbleUtil", f = "BubbleUtil.kt", i = {0, 0}, l = {24}, m = "loadNinePatchBubble", n = {"this", "url"}, s = {"L$0", "L$1"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public oOO00O0 f57179OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f57180OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public String f57181OooO0o0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f57183OooO0oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f57180OooO0o = obj;
            this.f57183OooO0oo |= Integer.MIN_VALUE;
            return oOO00O0.this.OooO00o(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO00o(@NotNull String str, @NotNull Continuation<? super NinePatchDrawable> continuation) {
        OooO00o oooO00o;
        oOO00O0 ooo00o0;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f57183OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f57183OooO0oo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object result = oooO00o.f57180OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f57183OooO0oo;
        LinkedHashMap linkedHashMap = f57178OooO0O0;
        if (i2 == 0) {
            ResultKt.throwOnFailure(result);
            NinePatchDrawable ninePatchDrawable = (NinePatchDrawable) linkedHashMap.get(str);
            if (Intrinsics.areEqual(ninePatchDrawable != null ? o0000oo.OooO00o(ninePatchDrawable) : null, "")) {
                return (NinePatchDrawable) linkedHashMap.get(str);
            }
            oooO00o.f57179OooO0Oo = this;
            oooO00o.f57181OooO0o0 = str;
            oooO00o.f57183OooO0oo = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(oooO00o), 1);
            cancellableContinuationImpl.initCancellability();
            OooOOOO<Bitmap> OoooOoO2 = OooO0OO.OooO0oo(o000O00O.OooO00o()).OooO0oO().OoooOoO(p184o00o00O0.OooO0OO.OooO0oO(o0000O0.OooO00o(58), o0000O0.OooO00o((float) 55.5d), str));
            OoooOoO2.OoooO(new oOO00(cancellableContinuationImpl), null, OoooOoO2, o00O0OO0.f38344OooO00o);
            result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(oooO00o);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
            ooo00o0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = oooO00o.f57181OooO0o0;
            ooo00o0 = oooO00o.f57179OooO0Oo;
            ResultKt.throwOnFailure(result);
        }
        Bitmap bitmap = (Bitmap) result;
        if (bitmap == null) {
            return null;
        }
        ooo00o0.getClass();
        Resources resources = o000O00O.OooO00o().getResources();
        o000O00O.OooO00o().getResources();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f = 24;
        int iOooO00o = o0000O0.OooO00o(f);
        float f2 = 2;
        int iOooO00o2 = o0000O0.OooO00o(f2);
        arrayList.add(Integer.valueOf(iOooO00o));
        arrayList.add(Integer.valueOf(iOooO00o + iOooO00o2));
        int iOooO00o3 = o0000O0.OooO00o(f);
        int iOooO00o4 = o0000O0.OooO00o(f2);
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
        linkedHashMap.put(str, ninePatchDrawable2);
        return ninePatchDrawable2;
    }
}
