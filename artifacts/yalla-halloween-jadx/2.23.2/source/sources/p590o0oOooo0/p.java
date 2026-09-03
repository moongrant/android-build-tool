package p590o0oOooo0;

import android.net.Uri;
import androidx.compose.compiler.plugins.kotlin.OooO0O0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.OooOOO;
import com.code.android.util.o000O00;
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
import p184o00o00O0.OooO0OO;
import p380o0OOoOo.o0ooOOo;
import p380o0OOoOo.oo000o;
import p381o0OOoOo0.Oooo000;
import p423o0OoO0OO.o0000OO0;
import p423o0OoO0OO.o00O00OO;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p595o0oo00O.OooOo00;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMomentSendEditUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentSendEditUtil.kt\ncom/yalla/yalla/util/MomentSendEditUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,269:1\n1864#2,2:270\n1855#2,2:272\n1866#2:274\n1855#2:275\n1864#2,3:276\n1856#2:280\n1855#2,2:281\n1#3:279\n*S KotlinDebug\n*F\n+ 1 MomentSendEditUtil.kt\ncom/yalla/yalla/util/MomentSendEditUtil\n*L\n147#1:270,2\n152#1:272,2\n147#1:274\n188#1:275\n191#1:276,3\n188#1:280\n235#1:281,2\n*E\n"})
public final class p {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MomentSendActivity f57246OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final CloudFileRepo f57247OooO0O0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public Uri f57248OooO00o;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f57250OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f57251OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public long f57252OooO0o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public String f57249OooO0O0 = "";

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public String f57253OooO0o0 = "";

        @NotNull
        public final String toString() {
            int i = this.f57250OooO0OO;
            int i2 = this.f57251OooO0Oo;
            long j = this.f57252OooO0o;
            String str = this.f57249OooO0O0;
            String str2 = this.f57253OooO0o0;
            StringBuilder sbOooO00o = o00000.OooO00o("UploadImageInfo(\twidth=", i, ",\theight=", i2, "\tduration=");
            sbOooO00o.append(j);
            sbOooO00o.append("\nurl='");
            sbOooO00o.append(str);
            return OooO0O0.OooO00o(sbOooO00o, "', \npath='", str2, "', )");
        }
    }

    public p(@NotNull MomentSendActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f57246OooO00o = activity;
        this.f57247OooO0O0 = new CloudFileRepo();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    public static final Object OooO00o(p pVar, MomentSendModel momentSendModel, Continuation continuation) {
        q qVar;
        String str;
        p pVar2 = pVar;
        MomentSendModel momentSendModel2 = momentSendModel;
        pVar.getClass();
        if (continuation instanceof q) {
            qVar = (q) continuation;
            int i = qVar.f57259OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                qVar.f57259OooO0oo = i - Integer.MIN_VALUE;
            } else {
                qVar = new q(pVar2, continuation);
            }
        } else {
            qVar = new q(pVar2, continuation);
        }
        Object objOooO0Oo = qVar.f57256OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = qVar.f57259OooO0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0Oo);
            if (momentSendModel.getListSendPostMedia().isEmpty() || o0000OO0.OooO0O0(momentSendModel.getListSendPostMedia(), momentSendModel.getHttpImagesFromEditMomentDetailMedia(), r.f57269OooO0Oo)) {
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
            qVar.f57255OooO0Oo = pVar2;
            qVar.f57257OooO0o0 = momentSendModel2;
            qVar.f57259OooO0oo = 1;
            String strOooO0Oo = oo000o.OooO0Oo("/Webservers/Resource/PicUpdateSet");
            o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 1);
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(postId), "dyId");
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(editId), "editId");
            o0oooooOooO00o.OooO0O0(editPicUrlName, "pNumber");
            o0oooooOooO00o.OooO0O0(editPicSizes, "size");
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
                o0oooooOooO00o.OooO0O0(editPicFile, "fileName");
                o0oooooOooO00o.OooO0O0(lBoxLong, "videoDuration");
                o0oooooOooO00o.OooO0O0(Boxing.boxInt(editIsNewVideo), "isVideo");
            } else {
                o0oooooOooO00o.OooO0O0(editPicFile, "fileName");
            }
            objOooO0Oo = OooOOO.OooO0Oo(new MomentEditRepo$momentEditPicUpdateSet$$inlined$call$1(o0oooooOooO00o, null), qVar);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MomentSendModel momentSendModel3 = qVar.f57257OooO0o0;
            p pVar3 = qVar.f57255OooO0Oo;
            ResultKt.throwOnFailure(objOooO0Oo);
            momentSendModel2 = momentSendModel3;
            pVar2 = pVar3;
        }
        if (((ApiResult) objOooO0Oo).isSuccess()) {
            momentSendModel2.setEditState(MomentEditState.ImageChangeSuccess);
            return momentSendModel2;
        }
        momentSendModel2.setEditState(MomentEditState.ImageChangeFailed);
        pVar2.f57246OooO00o.OooOo0();
        o000O00.OooO00o(o000000.Network_connection_lost);
        return momentSendModel2;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0160  */
    /* JADX WARN: Code duplicated, block: B:50:0x018c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0191  */
    /* JADX WARN: Code duplicated, block: B:54:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    public static final Object OooO0O0(p pVar, MomentSendModel momentSendModel, Continuation continuation) {
        t tVar;
        MomentSendContentModel content;
        String jSONString;
        Integer numBoxInt;
        Object objOooO0Oo;
        p pVar2;
        MomentSendModel momentSendModel2;
        Object obj;
        pVar.getClass();
        if (continuation instanceof t) {
            tVar = (t) continuation;
            int i = tVar.f57280OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                tVar.f57280OooO0oo = i - Integer.MIN_VALUE;
            } else {
                tVar = new t(pVar, continuation);
            }
        } else {
            tVar = new t(pVar, continuation);
        }
        Object obj2 = tVar.f57277OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = tVar.f57280OooO0oo;
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
            tVar.f57276OooO0Oo = pVar;
            tVar.f57278OooO0o0 = momentSendModel;
            tVar.f57280OooO0oo = 1;
            if (editPicUrlName != null && editPicUrlName.length() != 0) {
                z = false;
            }
            if (z) {
                String strOooO0Oo = oo000o.OooO0Oo("/Webservers/Discovery/EditMoment");
                o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 1);
                o0oooooOooO00o.OooO0O0(Boxing.boxLong(momentSendModel.getPostId()), "dyId");
                o0oooooOooO00o.OooO0O0(Boxing.boxInt(momentSendModel.getType()), "type");
                o0oooooOooO00o.OooO0O0(momentSendModel.getEditToken(), "editToken");
                content = momentSendModel.getContent();
                if (content != null) {
                    jSONString = content.toJSONString();
                } else {
                    jSONString = null;
                }
                o0oooooOooO00o.OooO0O0(oOO0OOO.OooO0O0(jSONString), "content");
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                numBoxInt = (Integer) o0O00oO0.OooO0OO().getValue();
                if (numBoxInt == null) {
                    numBoxInt = Boxing.boxInt(0);
                }
                o0oooooOooO00o.OooO0O0(numBoxInt, "countryId");
                o0oooooOooO00o.OooO0O0(oOO0OOO.OooO0O0(momentSendModel.getAddress()), IntegrityManager.INTEGRITY_TYPE_ADDRESS);
                o0oooooOooO00o.OooO0O0(momentSendModel.getLongitude(), "longitude");
                o0oooooOooO00o.OooO0O0(momentSendModel.getLatitude(), "latitude");
                o0oooooOooO00o.OooO0O0(Boxing.boxInt(momentSendModel.getEditIsNewPic()), "isNewPic");
                o0oooooOooO00o.OooO0O0(Boxing.boxInt(momentSendModel.getEditIsNewVideo()), "IsNewVideo");
                o0oooooOooO00o.OooO0O0(String.valueOf(OooOo00.OooO0OO()), "language");
                objOooO0Oo = OooOOO.OooO0Oo(new MomentEditRepo$momentEditSend$$inlined$call$1(o0oooooOooO00o, null), tVar);
            } else {
                if (editPicSizes == null || editPicSizes.length() == 0) {
                    String strOooO0Oo2 = oo000o.OooO0Oo("/Webservers/Discovery/EditMoment");
                    o0ooOOo o0oooooOooO00o2 = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo2, "url", strOooO0Oo2, 1);
                    o0oooooOooO00o2.OooO0O0(Boxing.boxLong(momentSendModel.getPostId()), "dyId");
                    o0oooooOooO00o2.OooO0O0(Boxing.boxInt(momentSendModel.getType()), "type");
                    o0oooooOooO00o2.OooO0O0(momentSendModel.getEditToken(), "editToken");
                    content = momentSendModel.getContent();
                    if (content != null) {
                        jSONString = content.toJSONString();
                    } else {
                        jSONString = null;
                    }
                    o0oooooOooO00o2.OooO0O0(oOO0OOO.OooO0O0(jSONString), "content");
                    o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                    numBoxInt = (Integer) o0O00oO0.OooO0OO().getValue();
                    if (numBoxInt == null) {
                        numBoxInt = Boxing.boxInt(0);
                    }
                    o0oooooOooO00o2.OooO0O0(numBoxInt, "countryId");
                    o0oooooOooO00o2.OooO0O0(oOO0OOO.OooO0O0(momentSendModel.getAddress()), IntegrityManager.INTEGRITY_TYPE_ADDRESS);
                    o0oooooOooO00o2.OooO0O0(momentSendModel.getLongitude(), "longitude");
                    o0oooooOooO00o2.OooO0O0(momentSendModel.getLatitude(), "latitude");
                    o0oooooOooO00o2.OooO0O0(Boxing.boxInt(momentSendModel.getEditIsNewPic()), "isNewPic");
                    o0oooooOooO00o2.OooO0O0(Boxing.boxInt(momentSendModel.getEditIsNewVideo()), "IsNewVideo");
                    o0oooooOooO00o2.OooO0O0(String.valueOf(OooOo00.OooO0OO()), "language");
                    objOooO0Oo = OooOOO.OooO0Oo(new MomentEditRepo$momentEditSend$$inlined$call$1(o0oooooOooO00o2, null), tVar);
                } else {
                    String strOooO0Oo3 = oo000o.OooO0Oo("/Webservers/Discovery/EditMoment");
                    t tVar2 = tVar;
                    o0ooOOo o0oooooOooO00o3 = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo3, "url", strOooO0Oo3, 1);
                    o0oooooOooO00o3.OooO0O0(Boxing.boxLong(momentSendModel.getPostId()), "dyId");
                    o0oooooOooO00o3.OooO0O0(Boxing.boxInt(momentSendModel.getType()), "type");
                    o0oooooOooO00o3.OooO0O0(momentSendModel.getEditToken(), "editToken");
                    MomentSendContentModel content2 = momentSendModel.getContent();
                    o0oooooOooO00o3.OooO0O0(oOO0OOO.OooO0O0(content2 != null ? content2.toJSONString() : null), "content");
                    o0O00oO0 o0o00oo3 = o0O00oO0.f47936OooO00o;
                    Integer numBoxInt2 = (Integer) o0O00oO0.OooO0OO().getValue();
                    if (numBoxInt2 == null) {
                        numBoxInt2 = Boxing.boxInt(0);
                    }
                    o0oooooOooO00o3.OooO0O0(numBoxInt2, "countryId");
                    o0oooooOooO00o3.OooO0O0(oOO0OOO.OooO0O0(momentSendModel.getAddress()), IntegrityManager.INTEGRITY_TYPE_ADDRESS);
                    o0oooooOooO00o3.OooO0O0(momentSendModel.getLongitude(), "longitude");
                    o0oooooOooO00o3.OooO0O0(momentSendModel.getLatitude(), "latitude");
                    o0oooooOooO00o3.OooO0O0(Boxing.boxInt(momentSendModel.getEditIsNewPic()), "isNewPic");
                    o0oooooOooO00o3.OooO0O0(Boxing.boxInt(momentSendModel.getEditIsNewVideo()), "IsNewVideo");
                    o0oooooOooO00o3.OooO0O0(editPicUrlName, "pNumber");
                    o0oooooOooO00o3.OooO0O0(editPicSizes, "size");
                    o0oooooOooO00o3.OooO0O0(String.valueOf(OooOo00.OooO0OO()), "language");
                    objOooO0Oo = OooOOO.OooO0Oo(new MomentEditRepo$momentEditSend$$inlined$call$2(o0oooooOooO00o3, null), tVar2);
                }
            }
            obj2 = objOooO0Oo;
            Object obj3 = coroutine_suspended;
            obj = obj3;
            if (obj2 != obj3) {
                pVar2 = pVar;
                momentSendModel2 = momentSendModel;
            }
            return obj;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        MomentSendModel momentSendModel3 = tVar.f57278OooO0o0;
        pVar2 = tVar.f57276OooO0Oo;
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
                o000O00.OooO00o(o000000.This_content_was_not_approved);
                LiveEventBus.get("MOMENT_BY_SYSTEM_REMOVE").post(Boxing.boxLong(momentSendModel2.getPostId()));
            } else if (code != 4000) {
                momentSendModel2.setEditState(MomentEditState.FailedSendFrequently);
                ApiError error = apiResult.getError();
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new Oooo000(error, null), 3, null);
            } else {
                o000O00.OooO00o(o000000.moment_delete_by_user);
                LiveEventBus.get("MOMENT_BY_SYSTEM_REMOVE").post(Boxing.boxLong(momentSendModel2.getPostId()));
            }
            pVar2.f57246OooO00o.OooOo0();
        }
        o0000O00.OooO0O0("sendEdit : \teditState=" + momentSendModel2.getEditState() + " \tdyId=" + momentSendModel2.getPostId() + " \teditId=" + momentSendModel2.getEditId() + ZegoConstants.ZegoVideoDataAuxPublishingStream);
        obj = momentSendModel2;
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x027f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x020a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0229  */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0246  */
    /* JADX WARN: Code duplicated, block: B:85:0x0252  */
    /* JADX WARN: Code duplicated, block: B:86:0x0254  */
    /* JADX WARN: Code duplicated, block: B:89:0x025a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0277  */
    /* JADX WARN: Code duplicated, block: B:93:0x0279  */
    /* JADX WARN: Code duplicated, block: B:95:0x027c  */
    public static final Object OooO0OO(p pVar, MomentSendModel momentSendModel, Continuation continuation) throws Throwable {
        u uVar;
        ArrayList<OooO00o> arrayList;
        Object objOooO0o;
        boolean z;
        StringBuffer stringBuffer;
        StringBuffer stringBuffer2;
        boolean z2;
        boolean z3;
        p pVar2 = pVar;
        MomentSendModel momentSendModel2 = momentSendModel;
        pVar.getClass();
        if (continuation instanceof u) {
            uVar = (u) continuation;
            int i = uVar.f57289OooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                uVar.f57289OooO = i - Integer.MIN_VALUE;
            } else {
                uVar = new u(pVar2, continuation);
            }
        } else {
            uVar = new u(pVar2, continuation);
        }
        u uVar2 = uVar;
        Object obj = uVar2.f57293OooO0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = uVar2.f57289OooO;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (momentSendModel.getListSendPostMedia().isEmpty() || o0000OO0.OooO0O0(momentSendModel.getListSendPostMedia(), momentSendModel.getHttpImagesFromEditMomentDetailMedia(), v.f57295OooO0Oo)) {
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
                oooO00o.f57253OooO0o0 = path;
                if (o00O00OO.OooO0Oo(momentSelectMedia.getPath())) {
                    String path2 = momentSelectMedia.getPath();
                    Intrinsics.checkNotNullParameter(path2, "<set-?>");
                    oooO00o.f57253OooO0o0 = path2;
                    for (MomentImageModel momentImageModel : momentSendModel.getHttpImagesFromEditMomentDetail()) {
                        if (Intrinsics.areEqual(momentSelectMedia.getPath(), momentImageModel.getUrl())) {
                            String url = momentImageModel.getUrl();
                            Intrinsics.checkNotNullParameter(url, "<set-?>");
                            oooO00o.f57249OooO0O0 = url;
                            oooO00o.f57251OooO0Oo = momentImageModel.getHeight();
                            oooO00o.f57250OooO0OO = momentImageModel.getWidth();
                        }
                    }
                } else {
                    String path3 = momentSelectMedia.getPath();
                    Intrinsics.checkNotNullParameter(path3, "<set-?>");
                    oooO00o.f57253OooO0o0 = path3;
                    longRef.element = momentSelectMedia.getDuration();
                    Uri uriFromFile = Uri.fromFile(new File(momentSelectMedia.getPath()));
                    if (uriFromFile != null) {
                        Intrinsics.checkNotNull(uriFromFile);
                        oooO00o.f57248OooO00o = uriFromFile;
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
                CloudFileRepo cloudFileRepo = pVar2.f57247OooO0O0;
                CloudFileType cloudFileType = CloudFileType.MOMENT_EDIT;
                Long lBoxLong = Boxing.boxLong(momentSendModel.getPostId());
                Boolean boolBoxBoolean = Boxing.boxBoolean(longRef.element > 0);
                uVar2.f57290OooO0Oo = pVar2;
                uVar2.f57292OooO0o0 = momentSendModel2;
                uVar2.f57291OooO0o = arrayList;
                uVar2.f57289OooO = 1;
                objOooO0o = cloudFileRepo.OooO0o(cloudFileType, arrayList2, lBoxLong, true, boolBoxBoolean, uVar2);
                if (objOooO0o == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (!arrayList.isEmpty()) {
                z = false;
                String strOooO0o = OooO0OO.OooO0o(((OooO00o) arrayList.get(0)).f57249OooO0O0);
                String strSubstring = strOooO0o.substring(0, StringsKt__StringsKt.lastIndexOf$default(strOooO0o, "/", 0, false, 6, (Object) null) + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                momentSendModel2.setEditPicFile(strSubstring);
            } else {
                z = false;
            }
            w wVar = new w(momentSendModel2);
            pVar2.getClass();
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
                String str = oooO00o2.f57249OooO0O0;
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
                stringBuffer2.append(oooO00o2.f57250OooO0OO + "*" + oooO00o2.f57251OooO0Oo);
                StringBuilder sb = new StringBuilder("uploadFile = ");
                sb.append(oooO00o2);
                o0000O00.OooO0O0(sb.toString());
            }
            String string = stringBuffer.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            String string2 = stringBuffer2.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            wVar.invoke(string, string2);
            momentSendModel2.setEditState(MomentEditState.ImageUploadSuccess);
            return momentSendModel2;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ArrayList arrayList3 = uVar2.f57291OooO0o;
        momentSendModel2 = uVar2.f57292OooO0o0;
        p pVar3 = uVar2.f57290OooO0Oo;
        ResultKt.throwOnFailure(obj);
        objOooO0o = obj;
        arrayList = arrayList3;
        pVar2 = pVar3;
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
                    if (Intrinsics.areEqual(oooO00o4.f57248OooO00o, uploadFileResult.getUri())) {
                        oooO00o4.f57250OooO0OO = uploadFileResult.getCloudFileInfo().f38406OooO0Oo;
                        oooO00o4.f57251OooO0Oo = uploadFileResult.getCloudFileInfo().f38408OooO0o0;
                        oooO00o4.f57252OooO0o = uploadFileResult.getCloudFileInfo().f38407OooO0o;
                        String strOooO00o = uploadFileResult.getCloudFileInfo().OooO00o();
                        Intrinsics.checkNotNullParameter(strOooO00o, "<set-?>");
                        oooO00o4.f57249OooO0O0 = strOooO00o;
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
            pVar2.f57246OooO00o.OooOo0();
            o000O00.OooO00o(o000000.Network_connection_lost);
            return momentSendModel2;
        }
        if (!arrayList.isEmpty()) {
            z = false;
            String strOooO0o2 = OooO0OO.OooO0o(((OooO00o) arrayList.get(0)).f57249OooO0O0);
            String strSubstring3 = strOooO0o2.substring(0, StringsKt__StringsKt.lastIndexOf$default(strOooO0o2, "/", 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
            momentSendModel2.setEditPicFile(strSubstring3);
        } else {
            z = false;
        }
        w wVar2 = new w(momentSendModel2);
        pVar2.getClass();
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
            String str2 = oooO00o2.f57249OooO0O0;
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
            stringBuffer2.append(oooO00o2.f57250OooO0OO + "*" + oooO00o2.f57251OooO0Oo);
            StringBuilder sb2 = new StringBuilder("uploadFile = ");
            sb2.append(oooO00o2);
            o0000O00.OooO0O0(sb2.toString());
        }
        String string3 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        String string4 = stringBuffer2.toString();
        Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
        wVar2.invoke(string3, string4);
        momentSendModel2.setEditState(MomentEditState.ImageUploadSuccess);
        return momentSendModel2;
    }
}
