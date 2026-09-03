package p032OoooO0;

import androidx.compose.foundation.text.KeyCommand;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import o00000O.o0OO00O;
import p034OoooO0O.o0000Ooo;
import p042Ooooo0o.o000O0O0;
import p054o00000oo.o000O;
import p054o00000oo.o000O0Oo;
import p054o00000oo.oo0oOO0;

/* JADX INFO: loaded from: classes.dex */
public final class oo0O extends Lambda implements Function1<o0000Ooo, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ KeyCommand f3427Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f3428OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o00OO f3429OoooO00;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KeyCommand.values().length];
            iArr[KeyCommand.COPY.ordinal()] = 1;
            iArr[KeyCommand.PASTE.ordinal()] = 2;
            iArr[KeyCommand.CUT.ordinal()] = 3;
            iArr[KeyCommand.LEFT_CHAR.ordinal()] = 4;
            iArr[KeyCommand.RIGHT_CHAR.ordinal()] = 5;
            iArr[KeyCommand.LEFT_WORD.ordinal()] = 6;
            iArr[KeyCommand.RIGHT_WORD.ordinal()] = 7;
            iArr[KeyCommand.PREV_PARAGRAPH.ordinal()] = 8;
            iArr[KeyCommand.NEXT_PARAGRAPH.ordinal()] = 9;
            iArr[KeyCommand.UP.ordinal()] = 10;
            iArr[KeyCommand.DOWN.ordinal()] = 11;
            iArr[KeyCommand.PAGE_UP.ordinal()] = 12;
            iArr[KeyCommand.PAGE_DOWN.ordinal()] = 13;
            iArr[KeyCommand.LINE_START.ordinal()] = 14;
            iArr[KeyCommand.LINE_END.ordinal()] = 15;
            iArr[KeyCommand.LINE_LEFT.ordinal()] = 16;
            iArr[KeyCommand.LINE_RIGHT.ordinal()] = 17;
            iArr[KeyCommand.HOME.ordinal()] = 18;
            iArr[KeyCommand.END.ordinal()] = 19;
            iArr[KeyCommand.DELETE_PREV_CHAR.ordinal()] = 20;
            iArr[KeyCommand.DELETE_NEXT_CHAR.ordinal()] = 21;
            iArr[KeyCommand.DELETE_PREV_WORD.ordinal()] = 22;
            iArr[KeyCommand.DELETE_NEXT_WORD.ordinal()] = 23;
            iArr[KeyCommand.DELETE_FROM_LINE_START.ordinal()] = 24;
            iArr[KeyCommand.DELETE_TO_LINE_END.ordinal()] = 25;
            iArr[KeyCommand.NEW_LINE.ordinal()] = 26;
            iArr[KeyCommand.TAB.ordinal()] = 27;
            iArr[KeyCommand.SELECT_ALL.ordinal()] = 28;
            iArr[KeyCommand.SELECT_LEFT_CHAR.ordinal()] = 29;
            iArr[KeyCommand.SELECT_RIGHT_CHAR.ordinal()] = 30;
            iArr[KeyCommand.SELECT_LEFT_WORD.ordinal()] = 31;
            iArr[KeyCommand.SELECT_RIGHT_WORD.ordinal()] = 32;
            iArr[KeyCommand.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
            iArr[KeyCommand.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
            iArr[KeyCommand.SELECT_LINE_START.ordinal()] = 35;
            iArr[KeyCommand.SELECT_LINE_END.ordinal()] = 36;
            iArr[KeyCommand.SELECT_LINE_LEFT.ordinal()] = 37;
            iArr[KeyCommand.SELECT_LINE_RIGHT.ordinal()] = 38;
            iArr[KeyCommand.SELECT_UP.ordinal()] = 39;
            iArr[KeyCommand.SELECT_DOWN.ordinal()] = 40;
            iArr[KeyCommand.SELECT_PAGE_UP.ordinal()] = 41;
            iArr[KeyCommand.SELECT_PAGE_DOWN.ordinal()] = 42;
            iArr[KeyCommand.SELECT_HOME.ordinal()] = 43;
            iArr[KeyCommand.SELECT_END.ordinal()] = 44;
            iArr[KeyCommand.DESELECT.ordinal()] = 45;
            iArr[KeyCommand.UNDO.ordinal()] = 46;
            iArr[KeyCommand.REDO.ordinal()] = 47;
            iArr[KeyCommand.CHARACTER_PALETTE.ordinal()] = 48;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0O(KeyCommand keyCommand, o00OO o00oo2, Ref.BooleanRef booleanRef) {
        super(1);
        this.f3427Oooo = keyCommand;
        this.f3429OoooO00 = o00oo2;
        this.f3428OoooO0 = booleanRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o0000Ooo o0000ooo) {
        o0OoOoOo.OooO00o oooO00o;
        o0000Ooo commandExecutionContext = o0000ooo;
        Intrinsics.checkNotNullParameter(commandExecutionContext, "$this$commandExecutionContext");
        oo0oOO0 oo0ooo0 = null;
        switch (OooO00o.$EnumSwitchMapping$0[this.f3427Oooo.ordinal()]) {
            case 1:
                this.f3429OoooO00.f3193OooO0O0.OooO0Oo(false);
                break;
            case 2:
                this.f3429OoooO00.f3193OooO0O0.OooOOO0();
                break;
            case 3:
                this.f3429OoooO00.f3193OooO0O0.OooO0o();
                break;
            case 4:
                o00O0OO or = o00O0OO.f3188Oooo;
                Objects.requireNonNull(commandExecutionContext);
                Intrinsics.checkNotNullParameter(or, "or");
                commandExecutionContext.f3579OooO0o0.f3544OooO00o = null;
                if (commandExecutionContext.f3580OooO0oO.f26774Oooo.length() > 0) {
                    if (o0OO00O.OooO0OO(commandExecutionContext.f3578OooO0o)) {
                        or.invoke(commandExecutionContext);
                    } else if (!commandExecutionContext.OooO0oO()) {
                        commandExecutionContext.OooOoo0(o0OO00O.OooO0o(commandExecutionContext.f3578OooO0o));
                    } else {
                        commandExecutionContext.OooOoo0(o0OO00O.OooO0oO(commandExecutionContext.f3578OooO0o));
                    }
                }
                break;
            case 5:
                o00O0OOO or2 = o00O0OOO.f3190Oooo;
                Objects.requireNonNull(commandExecutionContext);
                Intrinsics.checkNotNullParameter(or2, "or");
                commandExecutionContext.f3579OooO0o0.f3544OooO00o = null;
                if (commandExecutionContext.f3580OooO0oO.f26774Oooo.length() > 0) {
                    if (o0OO00O.OooO0OO(commandExecutionContext.f3578OooO0o)) {
                        or2.invoke(commandExecutionContext);
                    } else if (!commandExecutionContext.OooO0oO()) {
                        commandExecutionContext.OooOoo0(o0OO00O.OooO0oO(commandExecutionContext.f3578OooO0o));
                    } else {
                        commandExecutionContext.OooOoo0(o0OO00O.OooO0o(commandExecutionContext.f3578OooO0o));
                    }
                }
                break;
            case 6:
                commandExecutionContext.OooOO0O();
                break;
            case 7:
                commandExecutionContext.OooOOoo();
                break;
            case 8:
                commandExecutionContext.OooOOOo();
                break;
            case 9:
                commandExecutionContext.OooOOO0();
                break;
            case 10:
                commandExecutionContext.OooOoO();
                break;
            case 11:
                commandExecutionContext.OooO();
                break;
            case 12:
                commandExecutionContext.Oooo00O();
                break;
            case 13:
                commandExecutionContext.Oooo000();
                break;
            case 14:
                commandExecutionContext.OooOoO0();
                break;
            case 15:
                commandExecutionContext.OooOo0O();
                break;
            case 16:
                commandExecutionContext.OooOo0o();
                break;
            case 17:
                commandExecutionContext.OooOo();
                break;
            case 18:
                commandExecutionContext.OooOo0();
                break;
            case 19:
                commandExecutionContext.OooOo00();
                break;
            case 20:
                List<o000O> listOooOooO = commandExecutionContext.OooOooO(oo0oOO0.f3438Oooo);
                if (listOooOooO != null) {
                    this.f3429OoooO00.OooO00o(listOooOooO);
                }
                break;
            case 21:
                List<o000O> listOooOooO2 = commandExecutionContext.OooOooO(o00O.f3127Oooo);
                if (listOooOooO2 != null) {
                    this.f3429OoooO00.OooO00o(listOooOooO2);
                }
                break;
            case 22:
                List<o000O> listOooOooO3 = commandExecutionContext.OooOooO(o00OO000.f3201Oooo);
                if (listOooOooO3 != null) {
                    this.f3429OoooO00.OooO00o(listOooOooO3);
                }
                break;
            case 23:
                List<o000O> listOooOooO4 = commandExecutionContext.OooOooO(o00OO00O.f3202Oooo);
                if (listOooOooO4 != null) {
                    this.f3429OoooO00.OooO00o(listOooOooO4);
                }
                break;
            case 24:
                List<o000O> listOooOooO5 = commandExecutionContext.OooOooO(o00OO0O0.f3203Oooo);
                if (listOooOooO5 != null) {
                    this.f3429OoooO00.OooO00o(listOooOooO5);
                }
                break;
            case 25:
                List<o000O> listOooOooO6 = commandExecutionContext.OooOooO(o00OO0OO.f3204Oooo);
                if (listOooOooO6 != null) {
                    this.f3429OoooO00.OooO00o(listOooOooO6);
                }
                break;
            case 26:
                o00OO o00oo2 = this.f3429OoooO00;
                if (!o00oo2.f3197OooO0o0) {
                    o00oo2.OooO00o(CollectionsKt.listOf(new o000O0Oo("\n", 1)));
                } else {
                    this.f3428OoooO0.element = false;
                }
                break;
            case 27:
                o00OO o00oo3 = this.f3429OoooO00;
                if (!o00oo3.f3197OooO0o0) {
                    o00oo3.OooO00o(CollectionsKt.listOf(new o000O0Oo("\t", 1)));
                } else {
                    this.f3428OoooO0.element = false;
                }
                break;
            case 28:
                commandExecutionContext.f3579OooO0o0.f3544OooO00o = null;
                if (commandExecutionContext.f3580OooO0oO.f26774Oooo.length() > 0) {
                    commandExecutionContext.f3578OooO0o = o000O0O0.OooO00o(0, commandExecutionContext.f3580OooO0oO.f26774Oooo.length());
                }
                break;
            case 29:
                commandExecutionContext.OooOO0();
                commandExecutionContext.OooOoOO();
                break;
            case 30:
                commandExecutionContext.OooOOo();
                commandExecutionContext.OooOoOO();
                break;
            case 31:
                commandExecutionContext.OooOO0O();
                commandExecutionContext.OooOoOO();
                break;
            case 32:
                commandExecutionContext.OooOOoo();
                commandExecutionContext.OooOoOO();
                break;
            case 33:
                commandExecutionContext.OooOOOo();
                commandExecutionContext.OooOoOO();
                break;
            case 34:
                commandExecutionContext.OooOOO0();
                commandExecutionContext.OooOoOO();
                break;
            case 35:
                commandExecutionContext.OooOoO0();
                commandExecutionContext.OooOoOO();
                break;
            case 36:
                commandExecutionContext.OooOo0O();
                commandExecutionContext.OooOoOO();
                break;
            case 37:
                commandExecutionContext.OooOo0o();
                commandExecutionContext.OooOoOO();
                break;
            case 38:
                commandExecutionContext.OooOo();
                commandExecutionContext.OooOoOO();
                break;
            case 39:
                commandExecutionContext.OooOoO();
                commandExecutionContext.OooOoOO();
                break;
            case 40:
                commandExecutionContext.OooO();
                commandExecutionContext.OooOoOO();
                break;
            case 41:
                commandExecutionContext.Oooo00O();
                commandExecutionContext.OooOoOO();
                break;
            case 42:
                commandExecutionContext.Oooo000();
                commandExecutionContext.OooOoOO();
                break;
            case 43:
                commandExecutionContext.OooOo0();
                commandExecutionContext.OooOoOO();
                break;
            case 44:
                commandExecutionContext.OooOo00();
                commandExecutionContext.OooOoOO();
                break;
            case 45:
                commandExecutionContext.f3579OooO0o0.f3544OooO00o = null;
                if (commandExecutionContext.f3580OooO0oO.f26774Oooo.length() > 0) {
                    commandExecutionContext.OooOoo0(o0OO00O.OooO0Oo(commandExecutionContext.f3578OooO0o));
                }
                break;
            case 46:
                o0OoOoOo o0oooooo2 = this.f3429OoooO00.f3199OooO0oo;
                if (o0oooooo2 != null) {
                    o0oooooo2.OooO00o(oo0oOO0.OooO00o(commandExecutionContext.f3518OooO0oo, commandExecutionContext.f3580OooO0oO, commandExecutionContext.f3578OooO0o, 4));
                }
                o0OoOoOo o0oooooo3 = this.f3429OoooO00.f3199OooO0oo;
                if (o0oooooo3 != null) {
                    o0OoOoOo.OooO00o oooO00o2 = o0oooooo3.f3386OooO0O0;
                    if (oooO00o2 != null && (oooO00o = oooO00o2.f3391OooO00o) != null) {
                        o0oooooo3.f3386OooO0O0 = oooO00o;
                        o0oooooo3.f3388OooO0Oo -= oooO00o2.f3392OooO0O0.f27256OooO00o.f26774Oooo.length();
                        o0oooooo3.f3387OooO0OO = new o0OoOoOo.OooO00o(o0oooooo3.f3387OooO0OO, oooO00o2.f3392OooO0O0);
                        oo0ooo0 = oooO00o.f3392OooO0O0;
                    }
                    if (oo0ooo0 != null) {
                        this.f3429OoooO00.f3200OooOO0.invoke(oo0ooo0);
                    }
                }
                break;
            case 47:
                o0OoOoOo o0oooooo4 = this.f3429OoooO00.f3199OooO0oo;
                if (o0oooooo4 != null) {
                    o0OoOoOo.OooO00o oooO00o3 = o0oooooo4.f3387OooO0OO;
                    if (oooO00o3 != null) {
                        o0oooooo4.f3387OooO0OO = oooO00o3.f3391OooO00o;
                        o0oooooo4.f3386OooO0O0 = new o0OoOoOo.OooO00o(o0oooooo4.f3386OooO0O0, oooO00o3.f3392OooO0O0);
                        o0oooooo4.f3388OooO0Oo = oooO00o3.f3392OooO0O0.f27256OooO00o.f26774Oooo.length() + o0oooooo4.f3388OooO0Oo;
                        oo0ooo0 = oooO00o3.f3392OooO0O0;
                    }
                    if (oo0ooo0 != null) {
                        this.f3429OoooO00.f3200OooOO0.invoke(oo0ooo0);
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
