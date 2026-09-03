package p579o0oOoo;

import android.net.Uri;
import androidx.compose.compiler.plugins.kotlin.OooO0OO;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.OooOOO;
import com.code.android.util.o000O00O;
import com.facebook.appevents.integrity.IntegrityManager;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.repository.MomentEditRepo$momentEditPicUpdateSet$$inlined$call$1;
import com.yalla.yalla.data.repository.MomentEditRepo$momentEditSend$$inlined$call$1;
import com.yalla.yalla.data.repository.MomentEditRepo$momentEditSend$$inlined$call$2;
import com.yalla.yalla.manager.cloud_file.CloudFileType;
import com.yalla.yalla.model.MomentSelectMedia;
import com.yalla.yalla.model.UploadFileResult;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.moment.MomentEditResult;
import com.yalla.yalla.model.moment.MomentEditState;
import com.yalla.yalla.model.moment.MomentImageModel;
import com.yalla.yalla.model.moment.MomentSendContentModel;
import com.yalla.yalla.model.moment.MomentSendModel;
import com.yalla.yalla.model.moment.MomentType;
import com.yalla.yalla.repository.CloudFileRepo;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p041Ooooo0o.o00000;
import p139o00OOooO.OooO0o;
import p375o0OOoOO.o00000O0;
import p376o0OOoOOO.o000OOo0;
import p376o0OOoOOO.o0O0ooO;
import p385o0OOooOO.o00oOoo;
import p417o0OoO0.o0000O0O;
import p417o0OoO0.oo000o;
import p464o0Oooo.o000000O;
import p584o0oOooO0.oO00OOo0;
import p591o0oo000O.OooO;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMomentSendEditUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentSendEditUtil.kt\ncom/yalla/yalla/util/MomentSendEditUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,269:1\n1864#2,2:270\n1855#2,2:272\n1866#2:274\n1855#2:275\n1864#2,3:276\n1856#2:280\n1855#2,2:281\n1#3:279\n*S KotlinDebug\n*F\n+ 1 MomentSendEditUtil.kt\ncom/yalla/yalla/util/MomentSendEditUtil\n*L\n147#1:270,2\n152#1:272,2\n147#1:274\n188#1:275\n191#1:276,3\n188#1:280\n235#1:281,2\n*E\n"})
public final class oO0O0Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MomentSendActivity f56590OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final CloudFileRepo f56591OooO0O0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public Uri f56592OooO00o;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f56594OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f56595OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public long f56596OooO0o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public String f56593OooO0O0 = "";

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public String f56597OooO0o0 = "";

        @NotNull
        public final String toString() {
            int i = this.f56594OooO0OO;
            int i2 = this.f56595OooO0Oo;
            long j = this.f56596OooO0o;
            String str = this.f56593OooO0O0;
            String str2 = this.f56597OooO0o0;
            StringBuilder sbOooO00o = o00000.OooO00o("UploadImageInfo(\twidth=", i, ",\theight=", i2, "\tduration=");
            sbOooO00o.append(j);
            sbOooO00o.append("\nurl='");
            sbOooO00o.append(str);
            return OooO0OO.OooO0OO(sbOooO00o, "', \npath='", str2, "', )");
        }
    }

    public oO0O0Oo0(@NotNull MomentSendActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f56590OooO00o = activity;
        this.f56591OooO0O0 = new CloudFileRepo();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    public static final Object OooO00o(oO0O0Oo0 oo0o0oo0, MomentSendModel momentSendModel, Continuation continuation) {
        oOo0o0oO ooo0o0oo;
        String str;
        oO0O0Oo0 oo0o0oo1 = oo0o0oo0;
        MomentSendModel momentSendModel2 = momentSendModel;
        oo0o0oo0.getClass();
        if (continuation instanceof oOo0o0oO) {
            ooo0o0oo = (oOo0o0oO) continuation;
            int i = ooo0o0oo.f56717OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                ooo0o0oo.f56717OooO0oo = i - Integer.MIN_VALUE;
            } else {
                ooo0o0oo = new oOo0o0oO(oo0o0oo1, continuation);
            }
        } else {
            ooo0o0oo = new oOo0o0oO(oo0o0oo1, continuation);
        }
        Object objOooO0Oo = ooo0o0oo.f56714OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = ooo0o0oo.f56717OooO0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0Oo);
            if (momentSendModel.getListSendPostMedia().isEmpty() || oo000o.OooO0O0(momentSendModel.getListSendPostMedia(), momentSendModel.getHttpImagesFromEditMomentDetailMedia(), ooOOO0Oo.f56723OooO0Oo)) {
                momentSendModel2.setEditState(MomentEditState.ImageIsNull);
                return momentSendModel2;
            }
            long postId = momentSendModel.getPostId();
            long editId = momentSendModel.getEditId();
            String editPicFile = momentSendModel.getEditPicFile();
            String editPicUrlName = momentSendModel.getEditPicUrlName();
            String editPicSizes = momentSendModel.getEditPicSizes();
            int editIsNewVideo = momentSendModel.getEditIsNewVideo();
            Long lBoxLong = Boxing.boxLong(momentSendModel.getVideoDuration());
            ooo0o0oo.f56713OooO0Oo = oo0o0oo1;
            ooo0o0oo.f56715OooO0o0 = momentSendModel2;
            ooo0o0oo.f56717OooO0oo = 1;
            String strOooO0Oo = o000OOo0.OooO0Oo("/Webservers/Resource/PicUpdateSet");
            o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(strOooO0Oo, "url", strOooO0Oo, 1);
            o0o0oooOooO00o.OooO0O0(Boxing.boxLong(postId), "dyId");
            o0o0oooOooO00o.OooO0O0(Boxing.boxLong(editId), "editId");
            o0o0oooOooO00o.OooO0O0(editPicUrlName, "pNumber");
            o0o0oooOooO00o.OooO0O0(editPicSizes, "size");
            if (editIsNewVideo == 1) {
                Intrinsics.checkNotNullParameter(editPicFile, "<this>");
                Intrinsics.checkNotNullParameter(editPicFile, "<this>");
                String str2 = "http://";
                if (!StringsKt__StringsKt.contains(editPicFile, "http://", true)) {
                    str2 = "https://";
                    if (!StringsKt__StringsKt.contains(editPicFile, "https://", true)) {
                        str2 = "";
                    }
                }
                try {
                    str = str2 + new URL(editPicFile).getHost();
                } catch (Exception e) {
                    e.printStackTrace();
                    str = editPicFile;
                }
                if (StringsKt__StringsKt.contains(editPicFile, str, true)) {
                    editPicFile = editPicFile.substring(str.length() + 1);
                    Intrinsics.checkNotNullExpressionValue(editPicFile, "this as java.lang.String).substring(startIndex)");
                }
                o0o0oooOooO00o.OooO0O0(editPicFile, "fileName");
                o0o0oooOooO00o.OooO0O0(lBoxLong, "videoDuration");
                o0o0oooOooO00o.OooO0O0(Boxing.boxInt(editIsNewVideo), "isVideo");
            } else {
                o0o0oooOooO00o.OooO0O0(editPicFile, "fileName");
            }
            objOooO0Oo = OooOOO.OooO0Oo(new MomentEditRepo$momentEditPicUpdateSet$$inlined$call$1(o0o0oooOooO00o, null), ooo0o0oo);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MomentSendModel momentSendModel3 = ooo0o0oo.f56715OooO0o0;
            oO0O0Oo0 oo0o0oo2 = ooo0o0oo.f56713OooO0Oo;
            ResultKt.throwOnFailure(objOooO0Oo);
            momentSendModel2 = momentSendModel3;
            oo0o0oo1 = oo0o0oo2;
        }
        if (((ApiResult) objOooO0Oo).isSuccess()) {
            momentSendModel2.setEditState(MomentEditState.ImageChangeSuccess);
            return momentSendModel2;
        }
        momentSendModel2.setEditState(MomentEditState.ImageChangeFailed);
        oo0o0oo1.f56590OooO00o.OooOo0();
        o000O00O.OooO00o(oO00OOo0.Network_connection_lost);
        return momentSendModel2;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0160  */
    /* JADX WARN: Code duplicated, block: B:50:0x018c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0191  */
    /* JADX WARN: Code duplicated, block: B:54:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    public static final Object OooO0O0(oO0O0Oo0 oo0o0oo0, MomentSendModel momentSendModel, Continuation continuation) {
        ooo0o ooo0oVar;
        MomentSendContentModel content;
        String jSONString;
        Integer numBoxInt;
        Object objOooO0Oo;
        oO0O0Oo0 oo0o0oo1;
        MomentSendModel momentSendModel2;
        Object obj;
        oo0o0oo0.getClass();
        if (continuation instanceof ooo0o) {
            ooo0oVar = (ooo0o) continuation;
            int i = ooo0oVar.f56728OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                ooo0oVar.f56728OooO0oo = i - Integer.MIN_VALUE;
            } else {
                ooo0oVar = new ooo0o(oo0o0oo0, continuation);
            }
        } else {
            ooo0oVar = new ooo0o(oo0o0oo0, continuation);
        }
        Object obj2 = ooo0oVar.f56725OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = ooo0oVar.f56728OooO0oo;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj2);
            if (momentSendModel.getListSendPostMedia().isEmpty()) {
                int type = momentSendModel.getType();
                int value = (type == MomentType.Image.getValue() || type == MomentType.Video.getValue()) ? MomentType.Text.getValue() : MomentType.Text.getValue();
                momentSendModel.setType(value);
            }
            String editPicUrlName = momentSendModel.getEditPicUrlName();
            String editPicSizes = momentSendModel.getEditPicSizes();
            ooo0oVar.f56724OooO0Oo = oo0o0oo0;
            ooo0oVar.f56726OooO0o0 = momentSendModel;
            ooo0oVar.f56728OooO0oo = 1;
            if (editPicUrlName != null && editPicUrlName.length() != 0) {
                z = false;
            }
            if (z) {
                String strOooO0Oo = o000OOo0.OooO0Oo("/Webservers/Discovery/EditMoment");
                o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(strOooO0Oo, "url", strOooO0Oo, 1);
                o0o0oooOooO00o.OooO0O0(Boxing.boxLong(momentSendModel.getPostId()), "dyId");
                o0o0oooOooO00o.OooO0O0(Boxing.boxInt(momentSendModel.getType()), "type");
                o0o0oooOooO00o.OooO0O0(momentSendModel.getEditToken(), "editToken");
                content = momentSendModel.getContent();
                if (content != null) {
                    jSONString = content.toJSONString();
                } else {
                    jSONString = null;
                }
                o0o0oooOooO00o.OooO0O0(oO000Oo0.OooO0O0(jSONString), "content");
                o000000O o000000o2 = o000000O.f46674OooO00o;
                numBoxInt = (Integer) o000000O.OooO0OO().getValue();
                if (numBoxInt == null) {
                    numBoxInt = Boxing.boxInt(0);
                }
                o0o0oooOooO00o.OooO0O0(numBoxInt, "countryId");
                o0o0oooOooO00o.OooO0O0(oO000Oo0.OooO0O0(momentSendModel.getAddress()), IntegrityManager.INTEGRITY_TYPE_ADDRESS);
                o0o0oooOooO00o.OooO0O0(momentSendModel.getLongitude(), "longitude");
                o0o0oooOooO00o.OooO0O0(momentSendModel.getLatitude(), "latitude");
                o0o0oooOooO00o.OooO0O0(Boxing.boxInt(momentSendModel.getEditIsNewPic()), "isNewPic");
                o0o0oooOooO00o.OooO0O0(Boxing.boxInt(momentSendModel.getEditIsNewVideo()), "IsNewVideo");
                o0o0oooOooO00o.OooO0O0(String.valueOf(OooO.OooO0OO()), "language");
                objOooO0Oo = OooOOO.OooO0Oo(new MomentEditRepo$momentEditSend$$inlined$call$1(o0o0oooOooO00o, null), ooo0oVar);
            } else {
                if (editPicSizes == null || editPicSizes.length() == 0) {
                    String strOooO0Oo2 = o000OOo0.OooO0Oo("/Webservers/Discovery/EditMoment");
                    o0O0ooO o0o0oooOooO00o2 = o00oOoo.OooO00o(strOooO0Oo2, "url", strOooO0Oo2, 1);
                    o0o0oooOooO00o2.OooO0O0(Boxing.boxLong(momentSendModel.getPostId()), "dyId");
                    o0o0oooOooO00o2.OooO0O0(Boxing.boxInt(momentSendModel.getType()), "type");
                    o0o0oooOooO00o2.OooO0O0(momentSendModel.getEditToken(), "editToken");
                    content = momentSendModel.getContent();
                    if (content != null) {
                        jSONString = content.toJSONString();
                    } else {
                        jSONString = null;
                    }
                    o0o0oooOooO00o2.OooO0O0(oO000Oo0.OooO0O0(jSONString), "content");
                    o000000O o000000o3 = o000000O.f46674OooO00o;
                    numBoxInt = (Integer) o000000O.OooO0OO().getValue();
                    if (numBoxInt == null) {
                        numBoxInt = Boxing.boxInt(0);
                    }
                    o0o0oooOooO00o2.OooO0O0(numBoxInt, "countryId");
                    o0o0oooOooO00o2.OooO0O0(oO000Oo0.OooO0O0(momentSendModel.getAddress()), IntegrityManager.INTEGRITY_TYPE_ADDRESS);
                    o0o0oooOooO00o2.OooO0O0(momentSendModel.getLongitude(), "longitude");
                    o0o0oooOooO00o2.OooO0O0(momentSendModel.getLatitude(), "latitude");
                    o0o0oooOooO00o2.OooO0O0(Boxing.boxInt(momentSendModel.getEditIsNewPic()), "isNewPic");
                    o0o0oooOooO00o2.OooO0O0(Boxing.boxInt(momentSendModel.getEditIsNewVideo()), "IsNewVideo");
                    o0o0oooOooO00o2.OooO0O0(String.valueOf(OooO.OooO0OO()), "language");
                    objOooO0Oo = OooOOO.OooO0Oo(new MomentEditRepo$momentEditSend$$inlined$call$1(o0o0oooOooO00o2, null), ooo0oVar);
                } else {
                    String strOooO0Oo3 = o000OOo0.OooO0Oo("/Webservers/Discovery/EditMoment");
                    ooo0o ooo0oVar2 = ooo0oVar;
                    o0O0ooO o0o0oooOooO00o3 = o00oOoo.OooO00o(strOooO0Oo3, "url", strOooO0Oo3, 1);
                    o0o0oooOooO00o3.OooO0O0(Boxing.boxLong(momentSendModel.getPostId()), "dyId");
                    o0o0oooOooO00o3.OooO0O0(Boxing.boxInt(momentSendModel.getType()), "type");
                    o0o0oooOooO00o3.OooO0O0(momentSendModel.getEditToken(), "editToken");
                    MomentSendContentModel content2 = momentSendModel.getContent();
                    o0o0oooOooO00o3.OooO0O0(oO000Oo0.OooO0O0(content2 != null ? content2.toJSONString() : null), "content");
                    o000000O o000000o4 = o000000O.f46674OooO00o;
                    Integer numBoxInt2 = (Integer) o000000O.OooO0OO().getValue();
                    if (numBoxInt2 == null) {
                        numBoxInt2 = Boxing.boxInt(0);
                    }
                    o0o0oooOooO00o3.OooO0O0(numBoxInt2, "countryId");
                    o0o0oooOooO00o3.OooO0O0(oO000Oo0.OooO0O0(momentSendModel.getAddress()), IntegrityManager.INTEGRITY_TYPE_ADDRESS);
                    o0o0oooOooO00o3.OooO0O0(momentSendModel.getLongitude(), "longitude");
                    o0o0oooOooO00o3.OooO0O0(momentSendModel.getLatitude(), "latitude");
                    o0o0oooOooO00o3.OooO0O0(Boxing.boxInt(momentSendModel.getEditIsNewPic()), "isNewPic");
                    o0o0oooOooO00o3.OooO0O0(Boxing.boxInt(momentSendModel.getEditIsNewVideo()), "IsNewVideo");
                    o0o0oooOooO00o3.OooO0O0(editPicUrlName, "pNumber");
                    o0o0oooOooO00o3.OooO0O0(editPicSizes, "size");
                    o0o0oooOooO00o3.OooO0O0(String.valueOf(OooO.OooO0OO()), "language");
                    objOooO0Oo = OooOOO.OooO0Oo(new MomentEditRepo$momentEditSend$$inlined$call$2(o0o0oooOooO00o3, null), ooo0oVar2);
                }
            }
            obj2 = objOooO0Oo;
            Object obj3 = coroutine_suspended;
            obj = obj3;
            if (obj2 != obj3) {
                oo0o0oo1 = oo0o0oo0;
                momentSendModel2 = momentSendModel;
            }
            return obj;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        MomentSendModel momentSendModel3 = ooo0oVar.f56726OooO0o0;
        oo0o0oo1 = ooo0oVar.f56724OooO0Oo;
        ResultKt.throwOnFailure(obj2);
        momentSendModel2 = momentSendModel3;
        ApiResult apiResult = (ApiResult) obj2;
        if (apiResult.isSuccess()) {
            MomentEditResult momentEditResult = (MomentEditResult) apiResult.getData();
            if (momentEditResult != null) {
                long editId = momentEditResult.getEditId();
                if (editId > 0) {
                    momentSendModel2.setEditId(editId);
                }
            }
            momentSendModel2.setEditState(MomentEditState.ContentEditSuccess);
        } else {
            momentSendModel2.setEditState(MomentEditState.ContentEditFailed);
            int code = apiResult.getError().getCode();
            if (code == 2095) {
                o000O00O.OooO00o(oO00OOo0.This_content_was_not_approved);
                LiveEventBus.get("MOMENT_BY_SYSTEM_REMOVE").post(Boxing.boxLong(momentSendModel2.getPostId()));
            } else if (code != 4000) {
                momentSendModel2.setEditState(MomentEditState.FailedSendFrequently);
                ApiError error = apiResult.getError();
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000O0(error, null), 3, null);
            } else {
                o000O00O.OooO00o(oO00OOo0.moment_delete_by_user);
                LiveEventBus.get("MOMENT_BY_SYSTEM_REMOVE").post(Boxing.boxLong(momentSendModel2.getPostId()));
            }
            oo0o0oo1.f56590OooO00o.OooOo0();
        }
        OooOOO0.OooO0O0("sendEdit : \teditState=" + momentSendModel2.getEditState() + " \tdyId=" + momentSendModel2.getPostId() + " \teditId=" + momentSendModel2.getEditId() + ZegoConstants.ZegoVideoDataAuxPublishingStream);
        obj = momentSendModel2;
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0280 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x020c  */
    /* JADX WARN: Code duplicated, block: B:79:0x022b  */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0248  */
    /* JADX WARN: Code duplicated, block: B:85:0x0254  */
    /* JADX WARN: Code duplicated, block: B:86:0x0256  */
    /* JADX WARN: Code duplicated, block: B:89:0x025b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0278  */
    /* JADX WARN: Code duplicated, block: B:93:0x027a  */
    /* JADX WARN: Code duplicated, block: B:95:0x027d  */
    public static final Object OooO0OO(oO0O0Oo0 oo0o0oo0, MomentSendModel momentSendModel, Continuation continuation) throws Throwable {
        oO0OO00 oo0oo00;
        ArrayList<OooO00o> arrayList;
        Object objOooO0o;
        boolean z;
        StringBuffer stringBuffer;
        StringBuffer stringBuffer2;
        boolean z2;
        boolean z3;
        oO0O0Oo0 oo0o0oo1 = oo0o0oo0;
        MomentSendModel momentSendModel2 = momentSendModel;
        oo0o0oo0.getClass();
        if (continuation instanceof oO0OO00) {
            oo0oo00 = (oO0OO00) continuation;
            int i = oo0oo00.f56598OooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oo0oo00.f56598OooO = i - Integer.MIN_VALUE;
            } else {
                oo0oo00 = new oO0OO00(oo0o0oo1, continuation);
            }
        } else {
            oo0oo00 = new oO0OO00(oo0o0oo1, continuation);
        }
        oO0OO00 oo0oo01 = oo0oo00;
        Object obj = oo0oo01.f56602OooO0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oo0oo01.f56598OooO;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (momentSendModel.getListSendPostMedia().isEmpty() || oo000o.OooO0O0(momentSendModel.getListSendPostMedia(), momentSendModel.getHttpImagesFromEditMomentDetailMedia(), oO0OO0O.f56605OooO0Oo)) {
                momentSendModel2.setEditState(MomentEditState.ImageIsNull);
                return momentSendModel2;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList = new ArrayList();
            Ref.LongRef longRef = new Ref.LongRef();
            int i3 = 0;
            for (Object obj2 : momentSendModel.getListSendPostMedia()) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                MomentSelectMedia momentSelectMedia = (MomentSelectMedia) obj2;
                OooO00o oooO00o = new OooO00o();
                String path = momentSelectMedia.getPath();
                Intrinsics.checkNotNullParameter(path, "<set-?>");
                oooO00o.f56597OooO0o0 = path;
                if (o0000O0O.OooO0Oo(momentSelectMedia.getPath())) {
                    String path2 = momentSelectMedia.getPath();
                    Intrinsics.checkNotNullParameter(path2, "<set-?>");
                    oooO00o.f56597OooO0o0 = path2;
                    for (MomentImageModel momentImageModel : momentSendModel.getHttpImagesFromEditMomentDetail()) {
                        if (Intrinsics.areEqual(momentSelectMedia.getPath(), momentImageModel.getUrl())) {
                            String url = momentImageModel.getUrl();
                            Intrinsics.checkNotNullParameter(url, "<set-?>");
                            oooO00o.f56593OooO0O0 = url;
                            oooO00o.f56595OooO0Oo = momentImageModel.getHeight();
                            oooO00o.f56594OooO0OO = momentImageModel.getWidth();
                        }
                    }
                } else {
                    String path3 = momentSelectMedia.getPath();
                    Intrinsics.checkNotNullParameter(path3, "<set-?>");
                    oooO00o.f56597OooO0o0 = path3;
                    longRef.element = momentSelectMedia.getDuration();
                    Uri uriFromFile = Uri.fromFile(new File(momentSelectMedia.getPath()));
                    if (uriFromFile != null) {
                        Intrinsics.checkNotNullExpressionValue(uriFromFile, "fromFile(File(item.path))");
                        oooO00o.f56592OooO00o = uriFromFile;
                        Boxing.boxBoolean(arrayList2.add(uriFromFile));
                    }
                }
                arrayList.add(oooO00o);
                i3 = i4;
            }
            if (!momentSendModel.localMedias().isEmpty()) {
                momentSendModel2.setEditIsNewPic(0);
                momentSendModel2.setEditIsNewVideo(0);
                momentSendModel2.setVideoDuration(0L);
                if (longRef.element > 0) {
                    momentSendModel2.setEditIsNewVideo(1);
                    momentSendModel2.setVideoDuration(longRef.element);
                } else {
                    momentSendModel2.setEditIsNewPic(1);
                }
                CloudFileRepo cloudFileRepo = oo0o0oo1.f56591OooO0O0;
                CloudFileType cloudFileType = CloudFileType.MOMENT_EDIT;
                Long lBoxLong = Boxing.boxLong(momentSendModel.getPostId());
                Boolean boolBoxBoolean = Boxing.boxBoolean(longRef.element > 0);
                oo0oo01.f56599OooO0Oo = oo0o0oo1;
                oo0oo01.f56601OooO0o0 = momentSendModel2;
                oo0oo01.f56600OooO0o = arrayList;
                oo0oo01.f56598OooO = 1;
                objOooO0o = cloudFileRepo.OooO0o(cloudFileType, arrayList2, lBoxLong, true, boolBoxBoolean, oo0oo01);
                if (objOooO0o == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (!arrayList.isEmpty()) {
                z = false;
                String strOooO0o = OooO0o.OooO0o(((OooO00o) arrayList.get(0)).f56593OooO0O0);
                String strSubstring = strOooO0o.substring(0, StringsKt__StringsKt.lastIndexOf$default(strOooO0o, "/", 0, false, 6, (Object) null) + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                momentSendModel2.setEditPicFile(strSubstring);
            } else {
                z = false;
            }
            oO0Oo0o0 oo0oo0o0 = new oO0Oo0o0(momentSendModel2);
            oo0o0oo1.getClass();
            stringBuffer = new StringBuffer();
            stringBuffer2 = new StringBuffer();
            for (OooO00o oooO00o2 : arrayList) {
                if (stringBuffer.length() > 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (z2) {
                    stringBuffer.append("|");
                }
                String str = oooO00o2.f56593OooO0O0;
                String strSubstring2 = str.substring(StringsKt__StringsKt.lastIndexOf$default(str, "/", 0, false, 6, (Object) null) + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                stringBuffer.append(strSubstring2);
                if (stringBuffer2.length() > 0) {
                    z3 = true;
                } else {
                    z3 = z;
                }
                if (z3) {
                    stringBuffer2.append("|");
                }
                stringBuffer2.append(oooO00o2.f56594OooO0OO + "*" + oooO00o2.f56595OooO0Oo);
                StringBuilder sb = new StringBuilder("uploadFile = ");
                sb.append(oooO00o2);
                OooOOO0.OooO0O0(sb.toString());
            }
            String string = stringBuffer.toString();
            Intrinsics.checkNotNullExpressionValue(string, "urlName.toString()");
            String string2 = stringBuffer2.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "sizes.toString()");
            oo0oo0o0.invoke(string, string2);
            momentSendModel2.setEditState(MomentEditState.ImageUploadSuccess);
            return momentSendModel2;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ArrayList arrayList3 = oo0oo01.f56600OooO0o;
        momentSendModel2 = oo0oo01.f56601OooO0o0;
        oO0O0Oo0 oo0o0oo2 = oo0oo01.f56599OooO0Oo;
        ResultKt.throwOnFailure(obj);
        objOooO0o = obj;
        arrayList = arrayList3;
        oo0o0oo1 = oo0o0oo2;
        List<UploadFileResult> list = (List) objOooO0o;
        if (list != null) {
            for (UploadFileResult uploadFileResult : list) {
                OooO00o oooO00o3 = null;
                int i5 = -1;
                int i6 = 0;
                for (Object obj3 : arrayList) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    OooO00o oooO00o4 = (OooO00o) obj3;
                    if (Intrinsics.areEqual(oooO00o4.f56592OooO00o, uploadFileResult.getUri())) {
                        oooO00o4.f56594OooO0OO = uploadFileResult.getCloudFileInfo().f37356OooO0Oo;
                        oooO00o4.f56595OooO0Oo = uploadFileResult.getCloudFileInfo().f37358OooO0o0;
                        oooO00o4.f56596OooO0o = uploadFileResult.getCloudFileInfo().f37357OooO0o;
                        String strOooO00o = uploadFileResult.getCloudFileInfo().OooO00o();
                        Intrinsics.checkNotNullParameter(strOooO00o, "<set-?>");
                        oooO00o4.f56593OooO0O0 = strOooO00o;
                        i5 = i6;
                        oooO00o3 = oooO00o4;
                    }
                    i6 = i7;
                }
                if (oooO00o3 != null) {
                    arrayList.set(i5, oooO00o3);
                }
            }
        }
        if (list == null || list.isEmpty()) {
            momentSendModel2.setEditState(MomentEditState.ImageUploadFailed);
            oo0o0oo1.f56590OooO00o.OooOo0();
            o000O00O.OooO00o(oO00OOo0.Network_connection_lost);
            return momentSendModel2;
        }
        if (!arrayList.isEmpty()) {
            z = false;
            String strOooO0o2 = OooO0o.OooO0o(((OooO00o) arrayList.get(0)).f56593OooO0O0);
            String strSubstring3 = strOooO0o2.substring(0, StringsKt__StringsKt.lastIndexOf$default(strOooO0o2, "/", 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
            momentSendModel2.setEditPicFile(strSubstring3);
        } else {
            z = false;
        }
        oO0Oo0o0 oo0oo0o1 = new oO0Oo0o0(momentSendModel2);
        oo0o0oo1.getClass();
        stringBuffer = new StringBuffer();
        stringBuffer2 = new StringBuffer();
        while (r2.hasNext()) {
            if (stringBuffer.length() > 0) {
                z2 = true;
            } else {
                z2 = z;
            }
            if (z2) {
                stringBuffer.append("|");
            }
            String str2 = oooO00o2.f56593OooO0O0;
            String strSubstring4 = str2.substring(StringsKt__StringsKt.lastIndexOf$default(str2, "/", 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring4, "this as java.lang.String).substring(startIndex)");
            stringBuffer.append(strSubstring4);
            if (stringBuffer2.length() > 0) {
                z3 = true;
            } else {
                z3 = z;
            }
            if (z3) {
                stringBuffer2.append("|");
            }
            stringBuffer2.append(oooO00o2.f56594OooO0OO + "*" + oooO00o2.f56595OooO0Oo);
            StringBuilder sb2 = new StringBuilder("uploadFile = ");
            sb2.append(oooO00o2);
            OooOOO0.OooO0O0(sb2.toString());
        }
        String string3 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "urlName.toString()");
        String string4 = stringBuffer2.toString();
        Intrinsics.checkNotNullExpressionValue(string4, "sizes.toString()");
        oo0oo0o1.invoke(string3, string4);
        momentSendModel2.setEditState(MomentEditState.ImageUploadSuccess);
        return momentSendModel2;
    }
}
