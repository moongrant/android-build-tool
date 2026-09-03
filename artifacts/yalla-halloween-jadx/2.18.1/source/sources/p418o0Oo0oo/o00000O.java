package p418o0Oo0oo;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.input.pointer.PointerEventPass;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00O0O.OooO;
import o0O0O00.Oooo000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o00OOOO0;
import p048OoooooO.o00OOOOo;
import p048OoooooO.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalComposeUiApi
public final class o00000O implements o000000O {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final OooO00o f39670Oooo = new OooO00o();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Function1<? super MotionEvent, Boolean> f39671Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public o0000O0O f39672Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f39673Oooo0oo;

    public static final class OooO00o extends o000000 {

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        @NotNull
        public int f39675Oooo0oo = 1;

        /* JADX INFO: renamed from: o0Oo0oo.o00000O$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0382OooO00o extends Lambda implements Function1<MotionEvent, Unit> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ o00000O f39676Oooo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0382OooO00o(o00000O o00000o) {
                super(1);
                this.f39676Oooo0o = o00000o;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(MotionEvent motionEvent) {
                MotionEvent motionEvent2 = motionEvent;
                Intrinsics.checkNotNullParameter(motionEvent2, "motionEvent");
                this.f39676Oooo0o.OooO00o().invoke(motionEvent2);
                return Unit.INSTANCE;
            }
        }

        public static final class OooO0O0 extends Lambda implements Function1<MotionEvent, Unit> {

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ o00000O f39678Oooo0oO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(o00000O o00000o) {
                super(1);
                this.f39678Oooo0oO = o00000o;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(MotionEvent motionEvent) {
                MotionEvent motionEvent2 = motionEvent;
                Intrinsics.checkNotNullParameter(motionEvent2, "motionEvent");
                if (motionEvent2.getActionMasked() == 0) {
                    OooO00o.this.f39675Oooo0oo = this.f39678Oooo0oO.OooO00o().invoke(motionEvent2).booleanValue() ? 2 : 3;
                } else {
                    this.f39678Oooo0oO.OooO00o().invoke(motionEvent2);
                }
                return Unit.INSTANCE;
            }
        }

        public static final class OooO0OO extends Lambda implements Function1<MotionEvent, Unit> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ o00000O f39679Oooo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(o00000O o00000o) {
                super(1);
                this.f39679Oooo0o = o00000o;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(MotionEvent motionEvent) {
                MotionEvent motionEvent2 = motionEvent;
                Intrinsics.checkNotNullParameter(motionEvent2, "motionEvent");
                this.f39679Oooo0o.OooO00o().invoke(motionEvent2);
                return Unit.INSTANCE;
            }
        }

        public OooO00o() {
        }

        public final void o0O0O00(o00Oo0 toMotionEventScope) {
            boolean z;
            List<o0Oo0oo> list = toMotionEventScope.f39723OooO00o;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                } else {
                    if (list.get(i).OooO0OO()) {
                        z = true;
                        break;
                    }
                    i++;
                }
            }
            if (z) {
                if (this.f39675Oooo0oo == 2) {
                    Oooo000 oooo000 = this.f39668Oooo0o;
                    if (oooo000 == null) {
                        throw new IllegalStateException("layoutCoordinates not set".toString());
                    }
                    OooO.OooO00o oooO00o = OooO.f30391OooO0O0;
                    long jOoooO00 = oooo000.OoooO00(OooO.f30392OooO0OO);
                    C0382OooO00o block = new C0382OooO00o(o00000O.this);
                    Intrinsics.checkNotNullParameter(toMotionEventScope, "$this$toCancelMotionEventScope");
                    Intrinsics.checkNotNullParameter(block, "block");
                    o0000O0.OooO0O0(toMotionEventScope, jOoooO00, block, true);
                }
                this.f39675Oooo0oo = 3;
                return;
            }
            Oooo000 oooo001 = this.f39668Oooo0o;
            if (oooo001 == null) {
                throw new IllegalStateException("layoutCoordinates not set".toString());
            }
            OooO.OooO00o oooO00o2 = OooO.f30391OooO0O0;
            long jOoooO01 = oooo001.OoooO00(OooO.f30392OooO0OO);
            OooO0O0 block2 = new OooO0O0(o00000O.this);
            Intrinsics.checkNotNullParameter(toMotionEventScope, "$this$toMotionEventScope");
            Intrinsics.checkNotNullParameter(block2, "block");
            o0000O0.OooO0O0(toMotionEventScope, jOoooO01, block2, false);
            if (this.f39675Oooo0oo == 2) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    list.get(i2).OooO00o();
                }
                Oooo000 oooo002 = toMotionEventScope.f39724OooO0O0;
                if (oooo002 == null) {
                    return;
                }
                oooo002.f39667OooO0OO = !o00000O.this.f39673Oooo0oo;
            }
        }

        @Override // p418o0Oo0oo.o000000
        public final void o0OO00O() {
            if (this.f39675Oooo0oo == 2) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                OooO0OO block = new OooO0OO(o00000O.this);
                Intrinsics.checkNotNullParameter(block, "block");
                MotionEvent motionEvent = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0);
                motionEvent.setSource(0);
                Intrinsics.checkNotNullExpressionValue(motionEvent, "motionEvent");
                block.invoke(motionEvent);
                motionEvent.recycle();
                this.f39675Oooo0oo = 1;
                o00000O.this.f39673Oooo0oo = false;
            }
        }

        /* JADX WARN: Code duplicated, block: B:20:0x003e  */
        @Override // p418o0Oo0oo.o000000
        public final void oo0o0Oo(@NotNull o00Oo0 pointerEvent, @NotNull PointerEventPass pass, long j) {
            boolean z;
            boolean z2;
            boolean z3;
            Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
            Intrinsics.checkNotNullParameter(pass, "pass");
            List<o0Oo0oo> list = pointerEvent.f39723OooO00o;
            if (o00000O.this.f39673Oooo0oo) {
                z = true;
            } else {
                int size = list.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        z3 = false;
                        break;
                    }
                    o0Oo0oo o0oo0oo2 = list.get(i);
                    if (o00Ooo.OooO0O0(o0oo0oo2) || o00Ooo.OooO0Oo(o0oo0oo2)) {
                        z3 = true;
                        break;
                    }
                    i++;
                }
                if (z3) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (this.f39675Oooo0oo != 3) {
                if (pass == PointerEventPass.Initial && z) {
                    o0O0O00(pointerEvent);
                }
                if (pass == PointerEventPass.Final && !z) {
                    o0O0O00(pointerEvent);
                }
            }
            if (pass == PointerEventPass.Final) {
                int size2 = list.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        z2 = true;
                        break;
                    } else {
                        if (!o00Ooo.OooO0Oo(list.get(i2))) {
                            z2 = false;
                            break;
                        }
                        i2++;
                    }
                }
                if (z2) {
                    this.f39675Oooo0oo = 1;
                    o00000O.this.f39673Oooo0oo = false;
                }
            }
        }
    }

    @NotNull
    public final Function1<MotionEvent, Boolean> OooO00o() {
        Function1 function1 = this.f39671Oooo0o;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("onTouchEvent");
        return null;
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ o00OOOO0 OooOOoo(o00OOOO0 o00oooo1) {
        return o0o0Oo.OooO00o(this, o00oooo1);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object Oooo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // p418o0Oo0oo.o000000O
    @NotNull
    public final o000000 OoooO00() {
        return this.f39670Oooo;
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ boolean OooooOo(Function1 function1) {
        return o00OOOOo.OooO00o(this, function1);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }
}
