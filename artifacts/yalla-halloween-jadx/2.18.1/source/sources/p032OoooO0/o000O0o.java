package p032OoooO0;

import android.view.KeyEvent;
import androidx.compose.foundation.text.KeyCommand;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p650o0ooOoO.e;
import p650o0ooOoO.f;
import p650o0ooOoO.g;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO0O0 f3061OooO00o;

    public static final class OooO0O0 implements o000 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o000 f3063OooO00o;

        public OooO0O0(o000 o000Var) {
            this.f3063OooO00o = o000Var;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0051  */
        /* JADX WARN: Code duplicated, block: B:20:0x005a  */
        /* JADX WARN: Code duplicated, block: B:22:0x0068  */
        /* JADX WARN: Code duplicated, block: B:23:0x006c  */
        /* JADX WARN: Code duplicated, block: B:25:0x0074  */
        /* JADX WARN: Code duplicated, block: B:26:0x0078  */
        /* JADX WARN: Code duplicated, block: B:28:0x0080  */
        /* JADX WARN: Code duplicated, block: B:29:0x0083  */
        /* JADX WARN: Code duplicated, block: B:31:0x008b  */
        /* JADX WARN: Code duplicated, block: B:32:0x008e  */
        /* JADX WARN: Code duplicated, block: B:34:0x0096  */
        /* JADX WARN: Code duplicated, block: B:35:0x0099  */
        /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
        /* JADX WARN: Code duplicated, block: B:38:0x00a4  */
        /* JADX WARN: Code duplicated, block: B:40:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:41:0x00af  */
        /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:44:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:46:0x00c3  */
        /* JADX WARN: Code duplicated, block: B:48:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:49:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:51:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:52:0x00df  */
        @Override // p032OoooO0.o000
        @Nullable
        public final KeyCommand OooO00o(@NotNull KeyEvent isShiftPressed) {
            long jOooO00o;
            KeyCommand keyCommand;
            long jOooO00o2;
            Intrinsics.checkNotNullParameter(isShiftPressed, "event");
            Intrinsics.checkNotNullParameter(isShiftPressed, "$this$isShiftPressed");
            if (isShiftPressed.isShiftPressed()) {
                Intrinsics.checkNotNullParameter(isShiftPressed, "$this$isCtrlPressed");
                if (isShiftPressed.isCtrlPressed()) {
                    long jOooO00o3 = g.OooO00o(isShiftPressed);
                    o00O0000 o00o0001 = o00O0000.f3140OooO00o;
                    if (e.OooO00o(jOooO00o3, o00O0000.f3139OooO)) {
                        keyCommand = KeyCommand.SELECT_LEFT_WORD;
                    } else if (e.OooO00o(jOooO00o3, o00O0000.f3148OooOO0)) {
                        keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                    } else if (e.OooO00o(jOooO00o3, o00O0000.f3149OooOO0O)) {
                        keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else if (e.OooO00o(jOooO00o3, o00O0000.f3150OooOO0o)) {
                        keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                    } else {
                        keyCommand = null;
                    }
                } else {
                    Intrinsics.checkNotNullParameter(isShiftPressed, "$this$isCtrlPressed");
                    if (isShiftPressed.isCtrlPressed()) {
                        jOooO00o2 = g.OooO00o(isShiftPressed);
                        o00O0000 o00o0002 = o00O0000.f3140OooO00o;
                        if (e.OooO00o(jOooO00o2, o00O0000.f3139OooO)) {
                            keyCommand = KeyCommand.LEFT_WORD;
                        } else if (e.OooO00o(jOooO00o2, o00O0000.f3148OooOO0)) {
                            keyCommand = KeyCommand.RIGHT_WORD;
                        } else if (e.OooO00o(jOooO00o2, o00O0000.f3149OooOO0O)) {
                            keyCommand = KeyCommand.PREV_PARAGRAPH;
                        } else if (e.OooO00o(jOooO00o2, o00O0000.f3150OooOO0o)) {
                            keyCommand = KeyCommand.NEXT_PARAGRAPH;
                        } else if (e.OooO00o(jOooO00o2, o00O0000.f3143OooO0Oo)) {
                            keyCommand = KeyCommand.DELETE_PREV_CHAR;
                        } else if (e.OooO00o(jOooO00o2, o00O0000.f3159OooOo00)) {
                            keyCommand = KeyCommand.DELETE_NEXT_WORD;
                        } else if (e.OooO00o(jOooO00o2, o00O0000.f3157OooOOoo)) {
                            keyCommand = KeyCommand.DELETE_PREV_WORD;
                        } else if (e.OooO00o(jOooO00o2, o00O0000.f3147OooO0oo)) {
                            keyCommand = KeyCommand.DESELECT;
                        } else {
                            keyCommand = null;
                        }
                    } else {
                        Intrinsics.checkNotNullParameter(isShiftPressed, "$this$isShiftPressed");
                        if (isShiftPressed.isShiftPressed()) {
                            jOooO00o = g.OooO00o(isShiftPressed);
                            o00O0000 o00o0003 = o00O0000.f3140OooO00o;
                            if (e.OooO00o(jOooO00o, o00O0000.f3153OooOOOO)) {
                                keyCommand = KeyCommand.SELECT_HOME;
                            } else if (e.OooO00o(jOooO00o, o00O0000.f3154OooOOOo)) {
                                keyCommand = KeyCommand.SELECT_END;
                            } else {
                                keyCommand = null;
                            }
                        } else {
                            keyCommand = null;
                        }
                    }
                }
            } else {
                Intrinsics.checkNotNullParameter(isShiftPressed, "$this$isCtrlPressed");
                if (isShiftPressed.isCtrlPressed()) {
                    jOooO00o2 = g.OooO00o(isShiftPressed);
                    o00O0000 o00o0004 = o00O0000.f3140OooO00o;
                    if (e.OooO00o(jOooO00o2, o00O0000.f3139OooO)) {
                        keyCommand = KeyCommand.LEFT_WORD;
                    } else if (e.OooO00o(jOooO00o2, o00O0000.f3148OooOO0)) {
                        keyCommand = KeyCommand.RIGHT_WORD;
                    } else if (e.OooO00o(jOooO00o2, o00O0000.f3149OooOO0O)) {
                        keyCommand = KeyCommand.PREV_PARAGRAPH;
                    } else if (e.OooO00o(jOooO00o2, o00O0000.f3150OooOO0o)) {
                        keyCommand = KeyCommand.NEXT_PARAGRAPH;
                    } else if (e.OooO00o(jOooO00o2, o00O0000.f3143OooO0Oo)) {
                        keyCommand = KeyCommand.DELETE_PREV_CHAR;
                    } else if (e.OooO00o(jOooO00o2, o00O0000.f3159OooOo00)) {
                        keyCommand = KeyCommand.DELETE_NEXT_WORD;
                    } else if (e.OooO00o(jOooO00o2, o00O0000.f3157OooOOoo)) {
                        keyCommand = KeyCommand.DELETE_PREV_WORD;
                    } else if (e.OooO00o(jOooO00o2, o00O0000.f3147OooO0oo)) {
                        keyCommand = KeyCommand.DESELECT;
                    } else {
                        keyCommand = null;
                    }
                } else {
                    Intrinsics.checkNotNullParameter(isShiftPressed, "$this$isShiftPressed");
                    if (isShiftPressed.isShiftPressed()) {
                        jOooO00o = g.OooO00o(isShiftPressed);
                        o00O0000 o00o0005 = o00O0000.f3140OooO00o;
                        if (e.OooO00o(jOooO00o, o00O0000.f3153OooOOOO)) {
                            keyCommand = KeyCommand.SELECT_HOME;
                        } else if (e.OooO00o(jOooO00o, o00O0000.f3154OooOOOo)) {
                            keyCommand = KeyCommand.SELECT_END;
                        } else {
                            keyCommand = null;
                        }
                    } else {
                        keyCommand = null;
                    }
                }
            }
            return keyCommand == null ? this.f3063OooO00o.OooO00o(isShiftPressed) : keyCommand;
        }
    }

    static {
        OooO00o shortcutModifier = new PropertyReference1Impl() { // from class: OoooO0.o000O0o.OooO00o
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            @Nullable
            public final Object get(@Nullable Object obj) {
                return Boolean.valueOf(g.OooO0OO(((f) obj).f51138OooO00o));
            }
        };
        Intrinsics.checkNotNullParameter(shortcutModifier, "shortcutModifier");
        f3061OooO00o = new OooO0O0(new o000O000(shortcutModifier));
    }
}
