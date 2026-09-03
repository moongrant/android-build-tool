package p032OoooO0;

import android.view.KeyEvent;
import androidx.compose.foundation.text.KeyCommand;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p650o0ooOoO.e;
import p650o0ooOoO.f;
import p650o0ooOoO.g;

/* JADX INFO: loaded from: classes.dex */
public final class o000O000 implements o000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Function1<f, Boolean> f3042OooO00o;

    /* JADX WARN: Multi-variable type inference failed */
    public o000O000(Function1<? super f, Boolean> function1) {
        this.f3042OooO00o = function1;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:102:0x01be  */
    /* JADX WARN: Code duplicated, block: B:11:0x0048  */
    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:14:0x0058  */
    /* JADX WARN: Code duplicated, block: B:16:0x0060  */
    /* JADX WARN: Code duplicated, block: B:17:0x0064  */
    /* JADX WARN: Code duplicated, block: B:19:0x006c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0070  */
    /* JADX WARN: Code duplicated, block: B:22:0x0078  */
    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0084  */
    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    /* JADX WARN: Code duplicated, block: B:28:0x0090  */
    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:54:0x0100  */
    /* JADX WARN: Code duplicated, block: B:55:0x0104  */
    /* JADX WARN: Code duplicated, block: B:57:0x010c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0110  */
    /* JADX WARN: Code duplicated, block: B:60:0x0118  */
    /* JADX WARN: Code duplicated, block: B:61:0x011c  */
    /* JADX WARN: Code duplicated, block: B:63:0x012a  */
    /* JADX WARN: Code duplicated, block: B:64:0x012e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0136  */
    /* JADX WARN: Code duplicated, block: B:67:0x013a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0142  */
    /* JADX WARN: Code duplicated, block: B:70:0x0146  */
    /* JADX WARN: Code duplicated, block: B:72:0x014e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0152  */
    /* JADX WARN: Code duplicated, block: B:75:0x015a  */
    /* JADX WARN: Code duplicated, block: B:76:0x015e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0166  */
    /* JADX WARN: Code duplicated, block: B:79:0x0169  */
    /* JADX WARN: Code duplicated, block: B:81:0x0171  */
    /* JADX WARN: Code duplicated, block: B:82:0x0174  */
    /* JADX WARN: Code duplicated, block: B:84:0x017c  */
    /* JADX WARN: Code duplicated, block: B:85:0x017f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0187  */
    /* JADX WARN: Code duplicated, block: B:88:0x018a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0192  */
    /* JADX WARN: Code duplicated, block: B:91:0x0195  */
    /* JADX WARN: Code duplicated, block: B:93:0x019d  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:9:0x0035  */
    @Override // p032OoooO0.o000
    @Nullable
    public final KeyCommand OooO00o(@NotNull KeyEvent isShiftPressed) {
        long jOooO00o;
        long jOooO00o2;
        long jOooO00o3;
        boolean zOooO00o;
        Intrinsics.checkNotNullParameter(isShiftPressed, "event");
        if (this.f3042OooO00o.invoke(new f(isShiftPressed)).booleanValue()) {
            Intrinsics.checkNotNullParameter(isShiftPressed, "$this$isShiftPressed");
            if (isShiftPressed.isShiftPressed()) {
                long jOooO00o4 = g.OooO00o(isShiftPressed);
                o00O0000 o00o0001 = o00O0000.f3140OooO00o;
                if (e.OooO00o(jOooO00o4, o00O0000.f3146OooO0oO)) {
                    return KeyCommand.REDO;
                }
            } else if (this.f3042OooO00o.invoke(new f(isShiftPressed)).booleanValue()) {
                jOooO00o3 = g.OooO00o(isShiftPressed);
                o00O0000 o00o0002 = o00O0000.f3140OooO00o;
                if (e.OooO00o(jOooO00o3, o00O0000.f3142OooO0OO)) {
                    zOooO00o = true;
                } else {
                    zOooO00o = e.OooO00o(jOooO00o3, o00O0000.f3156OooOOo0);
                }
                if (zOooO00o) {
                    return KeyCommand.COPY;
                }
                if (e.OooO00o(jOooO00o3, o00O0000.f3145OooO0o0)) {
                    return KeyCommand.PASTE;
                }
                if (e.OooO00o(jOooO00o3, o00O0000.f3144OooO0o)) {
                    return KeyCommand.CUT;
                }
                if (e.OooO00o(jOooO00o3, o00O0000.f3141OooO0O0)) {
                    return KeyCommand.SELECT_ALL;
                }
                if (e.OooO00o(jOooO00o3, o00O0000.f3146OooO0oO)) {
                    return KeyCommand.UNDO;
                }
            } else {
                Intrinsics.checkNotNullParameter(isShiftPressed, "$this$isCtrlPressed");
                if (!isShiftPressed.isCtrlPressed()) {
                    Intrinsics.checkNotNullParameter(isShiftPressed, "$this$isShiftPressed");
                    if (isShiftPressed.isShiftPressed()) {
                        jOooO00o2 = g.OooO00o(isShiftPressed);
                        o00O0000 o00o0003 = o00O0000.f3140OooO00o;
                        if (e.OooO00o(jOooO00o2, o00O0000.f3139OooO)) {
                            return KeyCommand.SELECT_LEFT_CHAR;
                        }
                        if (e.OooO00o(jOooO00o2, o00O0000.f3148OooOO0)) {
                            return KeyCommand.SELECT_RIGHT_CHAR;
                        }
                        if (e.OooO00o(jOooO00o2, o00O0000.f3149OooOO0O)) {
                            return KeyCommand.SELECT_UP;
                        }
                        if (e.OooO00o(jOooO00o2, o00O0000.f3150OooOO0o)) {
                            return KeyCommand.SELECT_DOWN;
                        }
                        if (e.OooO00o(jOooO00o2, o00O0000.f3152OooOOO0)) {
                            return KeyCommand.SELECT_PAGE_UP;
                        }
                        if (e.OooO00o(jOooO00o2, o00O0000.f3151OooOOO)) {
                            return KeyCommand.SELECT_PAGE_DOWN;
                        }
                        if (e.OooO00o(jOooO00o2, o00O0000.f3153OooOOOO)) {
                            return KeyCommand.SELECT_LINE_START;
                        }
                        if (e.OooO00o(jOooO00o2, o00O0000.f3154OooOOOo)) {
                            return KeyCommand.SELECT_LINE_END;
                        }
                        if (e.OooO00o(jOooO00o2, o00O0000.f3156OooOOo0)) {
                            return KeyCommand.PASTE;
                        }
                    } else {
                        jOooO00o = g.OooO00o(isShiftPressed);
                        o00O0000 o00o0004 = o00O0000.f3140OooO00o;
                        if (e.OooO00o(jOooO00o, o00O0000.f3139OooO)) {
                            return KeyCommand.LEFT_CHAR;
                        }
                        if (e.OooO00o(jOooO00o, o00O0000.f3148OooOO0)) {
                            return KeyCommand.RIGHT_CHAR;
                        }
                        if (e.OooO00o(jOooO00o, o00O0000.f3149OooOO0O)) {
                            return KeyCommand.UP;
                        }
                        if (e.OooO00o(jOooO00o, o00O0000.f3150OooOO0o)) {
                            return KeyCommand.DOWN;
                        }
                        if (e.OooO00o(jOooO00o, o00O0000.f3152OooOOO0)) {
                            return KeyCommand.PAGE_UP;
                        }
                        if (e.OooO00o(jOooO00o, o00O0000.f3151OooOOO)) {
                            return KeyCommand.PAGE_DOWN;
                        }
                        if (e.OooO00o(jOooO00o, o00O0000.f3153OooOOOO)) {
                            return KeyCommand.LINE_START;
                        }
                        if (e.OooO00o(jOooO00o, o00O0000.f3154OooOOOo)) {
                            return KeyCommand.LINE_END;
                        }
                        if (e.OooO00o(jOooO00o, o00O0000.f3155OooOOo)) {
                            return KeyCommand.NEW_LINE;
                        }
                        if (e.OooO00o(jOooO00o, o00O0000.f3157OooOOoo)) {
                            return KeyCommand.DELETE_PREV_CHAR;
                        }
                        if (e.OooO00o(jOooO00o, o00O0000.f3159OooOo00)) {
                            return KeyCommand.DELETE_NEXT_CHAR;
                        }
                        if (e.OooO00o(jOooO00o, o00O0000.f3158OooOo0)) {
                            return KeyCommand.PASTE;
                        }
                        if (e.OooO00o(jOooO00o, o00O0000.f3160OooOo0O)) {
                            return KeyCommand.CUT;
                        }
                        if (e.OooO00o(jOooO00o, o00O0000.f3161OooOo0o)) {
                            return KeyCommand.TAB;
                        }
                    }
                }
            }
        } else if (this.f3042OooO00o.invoke(new f(isShiftPressed)).booleanValue()) {
            jOooO00o3 = g.OooO00o(isShiftPressed);
            o00O0000 o00o0005 = o00O0000.f3140OooO00o;
            if (e.OooO00o(jOooO00o3, o00O0000.f3142OooO0OO)) {
                zOooO00o = true;
            } else {
                zOooO00o = e.OooO00o(jOooO00o3, o00O0000.f3156OooOOo0);
            }
            if (zOooO00o) {
                return KeyCommand.COPY;
            }
            if (e.OooO00o(jOooO00o3, o00O0000.f3145OooO0o0)) {
                return KeyCommand.PASTE;
            }
            if (e.OooO00o(jOooO00o3, o00O0000.f3144OooO0o)) {
                return KeyCommand.CUT;
            }
            if (e.OooO00o(jOooO00o3, o00O0000.f3141OooO0O0)) {
                return KeyCommand.SELECT_ALL;
            }
            if (e.OooO00o(jOooO00o3, o00O0000.f3146OooO0oO)) {
                return KeyCommand.UNDO;
            }
        } else {
            Intrinsics.checkNotNullParameter(isShiftPressed, "$this$isCtrlPressed");
            if (!isShiftPressed.isCtrlPressed()) {
                Intrinsics.checkNotNullParameter(isShiftPressed, "$this$isShiftPressed");
                if (isShiftPressed.isShiftPressed()) {
                    jOooO00o2 = g.OooO00o(isShiftPressed);
                    o00O0000 o00o0006 = o00O0000.f3140OooO00o;
                    if (e.OooO00o(jOooO00o2, o00O0000.f3139OooO)) {
                        return KeyCommand.SELECT_LEFT_CHAR;
                    }
                    if (e.OooO00o(jOooO00o2, o00O0000.f3148OooOO0)) {
                        return KeyCommand.SELECT_RIGHT_CHAR;
                    }
                    if (e.OooO00o(jOooO00o2, o00O0000.f3149OooOO0O)) {
                        return KeyCommand.SELECT_UP;
                    }
                    if (e.OooO00o(jOooO00o2, o00O0000.f3150OooOO0o)) {
                        return KeyCommand.SELECT_DOWN;
                    }
                    if (e.OooO00o(jOooO00o2, o00O0000.f3152OooOOO0)) {
                        return KeyCommand.SELECT_PAGE_UP;
                    }
                    if (e.OooO00o(jOooO00o2, o00O0000.f3151OooOOO)) {
                        return KeyCommand.SELECT_PAGE_DOWN;
                    }
                    if (e.OooO00o(jOooO00o2, o00O0000.f3153OooOOOO)) {
                        return KeyCommand.SELECT_LINE_START;
                    }
                    if (e.OooO00o(jOooO00o2, o00O0000.f3154OooOOOo)) {
                        return KeyCommand.SELECT_LINE_END;
                    }
                    if (e.OooO00o(jOooO00o2, o00O0000.f3156OooOOo0)) {
                        return KeyCommand.PASTE;
                    }
                } else {
                    jOooO00o = g.OooO00o(isShiftPressed);
                    o00O0000 o00o0007 = o00O0000.f3140OooO00o;
                    if (e.OooO00o(jOooO00o, o00O0000.f3139OooO)) {
                        return KeyCommand.LEFT_CHAR;
                    }
                    if (e.OooO00o(jOooO00o, o00O0000.f3148OooOO0)) {
                        return KeyCommand.RIGHT_CHAR;
                    }
                    if (e.OooO00o(jOooO00o, o00O0000.f3149OooOO0O)) {
                        return KeyCommand.UP;
                    }
                    if (e.OooO00o(jOooO00o, o00O0000.f3150OooOO0o)) {
                        return KeyCommand.DOWN;
                    }
                    if (e.OooO00o(jOooO00o, o00O0000.f3152OooOOO0)) {
                        return KeyCommand.PAGE_UP;
                    }
                    if (e.OooO00o(jOooO00o, o00O0000.f3151OooOOO)) {
                        return KeyCommand.PAGE_DOWN;
                    }
                    if (e.OooO00o(jOooO00o, o00O0000.f3153OooOOOO)) {
                        return KeyCommand.LINE_START;
                    }
                    if (e.OooO00o(jOooO00o, o00O0000.f3154OooOOOo)) {
                        return KeyCommand.LINE_END;
                    }
                    if (e.OooO00o(jOooO00o, o00O0000.f3155OooOOo)) {
                        return KeyCommand.NEW_LINE;
                    }
                    if (e.OooO00o(jOooO00o, o00O0000.f3157OooOOoo)) {
                        return KeyCommand.DELETE_PREV_CHAR;
                    }
                    if (e.OooO00o(jOooO00o, o00O0000.f3159OooOo00)) {
                        return KeyCommand.DELETE_NEXT_CHAR;
                    }
                    if (e.OooO00o(jOooO00o, o00O0000.f3158OooOo0)) {
                        return KeyCommand.PASTE;
                    }
                    if (e.OooO00o(jOooO00o, o00O0000.f3160OooOo0O)) {
                        return KeyCommand.CUT;
                    }
                    if (e.OooO00o(jOooO00o, o00O0000.f3161OooOo0o)) {
                        return KeyCommand.TAB;
                    }
                }
            }
        }
        return null;
    }
}
