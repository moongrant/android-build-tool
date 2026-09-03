package p497o0o00OoO;

import android.os.Looper;
import android.text.TextUtils;
import androidx.activity.OooOo00;
import androidx.compose.runtime.MutableState;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.mixedroom.MixedRoomDataSource;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.model.room.RoomMessageReplyInfo;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.ui.view.editTextSpan.MessageEditText;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import p371o0OOo0oO.oo000o;
import p442o0OoOo0O.o000;
import p482o0o000OO.OooOOO;
import p483o0o000Oo.o0OOO0o;
import p557o0oOOooO.oOo0000O;
import p557o0oOOooO.oOo00ooO;
import p562o0oOo000.o000000;
import p590o0oOooo0.oOOO00;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0000 f49755OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O(o0000 o0000Var) {
        super(0);
        this.f49755OooO0Oo = o0000Var;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x012c  */
    /* JADX WARN: Code duplicated, block: B:76:0x013d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0165  */
    /* JADX WARN: Code duplicated, block: B:79:0x016f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0179  */
    /* JADX WARN: Code duplicated, block: B:82:0x0183  */
    /* JADX WARN: Code duplicated, block: B:84:0x0186  */
    /* JADX WARN: Code duplicated, block: B:85:0x0195  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c7  */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x013d, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String string;
        ChatModel value;
        RoomMessageReplyInfo replayModel;
        oOo00ooO ooo00ooo;
        HashMap map;
        RoomLiveService roomLiveService;
        o0000 o0000Var = this.f49755OooO0Oo;
        String strValueOf = String.valueOf(o0000Var.OooO00o().getText());
        MessageEditText etMessageInput = o0000Var.OooO00o();
        boolean zOooO0Oo = o0000Var.OooO0Oo();
        oo000o oo000oVarOooO0O0 = o0000Var.OooO0O0();
        o000 o000VarOooO0OO = o0000Var.OooO0OO();
        boolean z = true;
        boolean z2 = etMessageInput.getSpanManager().OooO0OO("@") > 0;
        String string2 = StringsKt.trim((CharSequence) strValueOf).toString();
        if (string2 == null || StringsKt.isBlank(string2)) {
            String strOooO0OO = o0000.OooO0OO(o000000.chat_room_on_Txt);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            o0OOO0o o0ooo0o2 = OooO00o.f24526OooOOo;
            if (jCurrentTimeMillis - ((Number) o0ooo0o2.f48644OooO0O0.getValue()).longValue() >= 1000) {
                string = etMessageInput.getTransformedText().toString();
                MutableState mutableState = o0ooo0o2.f48643OooO00o;
                if (StringsKt__StringsJVMKt.equals((String) mutableState.getValue(), string, true)) {
                    String strOooO0OO2 = o0000.OooO0OO(o000000.char_room_content);
                    if (!(strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2))) {
                        o000Oo0 o000oo0OooO00o2 = OooOo00.OooO00o(strOooO0OO2, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o2.run();
                        } else {
                            o000O00O.f13422OooO0O0.post(o000oo0OooO00o2);
                        }
                    }
                } else {
                    Intrinsics.checkNotNullParameter(string, "<set-?>");
                    mutableState.setValue(string);
                }
                if (!TextUtils.isEmpty(string) && MixedRoomDataSource.OooO0o0().f22992OooO0o0 != null) {
                    if (zOooO0Oo) {
                        if (oo000oVarOooO0O0 != null) {
                            oo000oVarOooO0O0.OooO00o();
                        }
                        if (string != null && !StringsKt.isBlank(string)) {
                            z = false;
                        }
                        if (!z) {
                            o0000O00.OooO0O0("sendNobleBroadcast " + string);
                            map = new HashMap();
                            map.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, string);
                            map.put("lang", p595o0oo00O.OooOo00.OooO0O0());
                            roomLiveService = RoomLiveService.f24596OooOo00;
                            if (roomLiveService != null) {
                                roomLiveService.OooO0oO(10019, oOOO00.OooO0OO(map));
                            }
                        }
                    } else {
                        value = o000VarOooO0OO.f47211OooO00o.getValue();
                        if (value != null) {
                            replayModel = new RoomMessageReplyInfo().getReplayModel(value);
                        } else {
                            replayModel = null;
                        }
                        if (z2) {
                            ooo00ooo = etMessageInput.getSpanManager().OooO0O0("@").get(0);
                        } else {
                            ooo00ooo = null;
                        }
                        OooOOO.OooO0OO(string, ooo00ooo, replayModel);
                        oOo0000O spanManager = etMessageInput.getSpanManager();
                        spanManager.OooO00o();
                        spanManager.f56176OooO00o.clear();
                        o000VarOooO0OO.f47211OooO00o.setValue(null);
                        o000VarOooO0OO.f47212OooO0O0.setValue(Boolean.FALSE);
                    }
                    OooO00o.f24526OooOOo.f48644OooO0O0.setValue(Long.valueOf(System.currentTimeMillis()));
                    Intrinsics.checkNotNullParameter(etMessageInput, "etMessageInput");
                    if (oo000oVarOooO0O0 != null) {
                        etMessageInput.setText("");
                        oOo0000O spanManager2 = etMessageInput.getSpanManager();
                        spanManager2.OooO00o();
                        spanManager2.f56176OooO00o.clear();
                        etMessageInput.getMaskKeys().clear();
                    }
                }
                return Unit.INSTANCE;
            }
            String strOooO0OO3 = o0000.OooO0OO(o000000.message_too_often);
            if (!(strOooO0OO3 == null || StringsKt.isBlank(strOooO0OO3))) {
                o000Oo0 o000oo0OooO00o3 = OooOo00.OooO00o(strOooO0OO3, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o3.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o3);
                }
            }
        }
        string = null;
        if (!TextUtils.isEmpty(string)) {
            if (zOooO0Oo) {
                if (oo000oVarOooO0O0 != null) {
                    oo000oVarOooO0O0.OooO00o();
                }
                if (string != null) {
                    z = false;
                }
                if (!z) {
                    o0000O00.OooO0O0("sendNobleBroadcast " + string);
                    map = new HashMap();
                    map.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, string);
                    map.put("lang", p595o0oo00O.OooOo00.OooO0O0());
                    roomLiveService = RoomLiveService.f24596OooOo00;
                    if (roomLiveService != null) {
                        roomLiveService.OooO0oO(10019, oOOO00.OooO0OO(map));
                    }
                }
            } else {
                value = o000VarOooO0OO.f47211OooO00o.getValue();
                if (value != null) {
                    replayModel = new RoomMessageReplyInfo().getReplayModel(value);
                } else {
                    replayModel = null;
                }
                if (z2) {
                    ooo00ooo = etMessageInput.getSpanManager().OooO0O0("@").get(0);
                } else {
                    ooo00ooo = null;
                }
                OooOOO.OooO0OO(string, ooo00ooo, replayModel);
                oOo0000O spanManager3 = etMessageInput.getSpanManager();
                spanManager3.OooO00o();
                spanManager3.f56176OooO00o.clear();
                o000VarOooO0OO.f47211OooO00o.setValue(null);
                o000VarOooO0OO.f47212OooO0O0.setValue(Boolean.FALSE);
            }
            OooO00o.f24526OooOOo.f48644OooO0O0.setValue(Long.valueOf(System.currentTimeMillis()));
            Intrinsics.checkNotNullParameter(etMessageInput, "etMessageInput");
            if (oo000oVarOooO0O0 != null) {
                etMessageInput.setText("");
                oOo0000O spanManager4 = etMessageInput.getSpanManager();
                spanManager4.OooO00o();
                spanManager4.f56176OooO00o.clear();
                etMessageInput.getMaskKeys().clear();
            }
        }
        return Unit.INSTANCE;
    }
}
