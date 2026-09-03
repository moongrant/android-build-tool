package p617o0oo0o;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.adapter.imageView9Grid.ImageView9GridModel;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.common.manager.cloud_file.CloudFileType;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.repository.CloudFileRepo;
import com.yalla.yalla.model.MomentEditResult;
import com.yalla.yalla.model.MomentEditState;
import com.yalla.yalla.model.MomentSendModel;
import com.yalla.yalla.model.MomentType;
import com.yalla.yalla.model.UploadFileResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p058o0000OoO.OooO;
import p206o00o0o0o.o000Oo0;
import p515o0o0O00.o00O00;
import p520o0o0O0O0.o000O0o;
import p522o0o0O0o.o000O0;
import p522o0o0O0o.o00O0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o000O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f48489OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final CloudFileRepo f48490OooO0O0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public Uri f48491OooO00o;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f48493OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f48494OooO0Oo;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public String f48492OooO0O0 = "";

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public String f48495OooO0o0 = "";

        public final void OooO00o(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f48495OooO0o0 = str;
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("UploadImageInfo(\twidth=");
            sbOooO0o0.append(this.f48493OooO0OO);
            sbOooO0o0.append(",\theight=");
            sbOooO0o0.append(this.f48494OooO0Oo);
            sbOooO0o0.append("\nurl='");
            sbOooO0o0.append(this.f48492OooO0O0);
            sbOooO0o0.append("', \npath='");
            return OooO.OooO00o(sbOooO0o0, this.f48495OooO0o0, "', )");
        }
    }

    public o000O00(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f48489OooO00o = context;
        this.f48490OooO0O0 = new CloudFileRepo();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object OooO00o(o000O00 o000o01, MomentSendModel momentSendModel, Continuation continuation) {
        o000O00O o000o00o2;
        Objects.requireNonNull(o000o01);
        if (continuation instanceof o000O00O) {
            o000o00o2 = (o000O00O) continuation;
            int i = o000o00o2.f48504Oooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000o00o2.f48504Oooo = i - Integer.MIN_VALUE;
            } else {
                o000o00o2 = new o000O00O(o000o01, continuation);
            }
        } else {
            o000o00o2 = new o000O00O(o000o01, continuation);
        }
        o000O00O o000o00o3 = o000o00o2;
        Object objOooO0Oo = o000o00o3.f48506Oooo0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o000o00o3.f48504Oooo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0Oo);
            if (momentSendModel.getListSendPostImage().isEmpty() || o000O0.OooO0O0(momentSendModel.getListSendPostImage(), momentSendModel.getHttpImagesFromEditMomentDetailUrl(), o000O0.f48488Oooo0o)) {
                momentSendModel.setEditState(MomentEditState.ImageIsNull);
                return momentSendModel;
            }
            o000O0o o000o0o2 = o000O0o.f42578OooO00o;
            long postId = momentSendModel.getPostId();
            long editId = momentSendModel.getEditId();
            String editPicFile = momentSendModel.getEditPicFile();
            String editPicUrlName = momentSendModel.getEditPicUrlName();
            String editPicSizes = momentSendModel.getEditPicSizes();
            o000o00o3.f48505Oooo0o = momentSendModel;
            o000o00o3.f48504Oooo = 1;
            objOooO0Oo = o000o0o2.OooO0Oo(postId, editId, editPicFile, editPicUrlName, editPicSizes, o000o00o3);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            momentSendModel = o000o00o3.f48505Oooo0o;
            ResultKt.throwOnFailure(objOooO0Oo);
        }
        if (((ApiResult) objOooO0Oo).isSuccess()) {
            momentSendModel.setEditState(MomentEditState.ImageChangeSuccess);
            return momentSendModel;
        }
        momentSendModel.setEditState(MomentEditState.ImageChangeFailed);
        return momentSendModel;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object OooO0O0(o000O00 o000o01, MomentSendModel momentSendModel, Continuation continuation) {
        o000OO0O o000oo0o2;
        Objects.requireNonNull(o000o01);
        if (continuation instanceof o000OO0O) {
            o000oo0o2 = (o000OO0O) continuation;
            int i = o000oo0o2.f48528Oooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000oo0o2.f48528Oooo = i - Integer.MIN_VALUE;
            } else {
                o000oo0o2 = new o000OO0O(o000o01, continuation);
            }
        } else {
            o000oo0o2 = new o000OO0O(o000o01, continuation);
        }
        Object objOooO0o0 = o000oo0o2.f48530Oooo0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o000oo0o2.f48528Oooo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0o0);
            if (momentSendModel.getType() == MomentType.Image.getValue() && momentSendModel.getListSendPostImage().isEmpty()) {
                momentSendModel.setType(MomentType.Text.getValue());
            }
            o000O0o o000o0o2 = o000O0o.f42578OooO00o;
            String editPicUrlName = momentSendModel.getEditPicUrlName();
            String editPicSizes = momentSendModel.getEditPicSizes();
            o000oo0o2.f48529Oooo0o = momentSendModel;
            o000oo0o2.f48528Oooo = 1;
            objOooO0o0 = o000o0o2.OooO0o0(momentSendModel, editPicUrlName, editPicSizes, o000oo0o2);
            if (objOooO0o0 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            momentSendModel = o000oo0o2.f48529Oooo0o;
            ResultKt.throwOnFailure(objOooO0o0);
        }
        ApiResult apiResult = (ApiResult) objOooO0o0;
        if (apiResult.isSuccess()) {
            MomentEditResult momentEditResult = (MomentEditResult) apiResult.getData();
            if (momentEditResult != null) {
                long editId = momentEditResult.getEditId();
                if (editId > 0) {
                    momentSendModel.setEditId(editId);
                }
            }
            momentSendModel.setEditState(MomentEditState.ContentEditSuccess);
        } else {
            momentSendModel.setEditState(MomentEditState.ContentEditFailed);
            if (apiResult.getError().getCode() == 4004) {
                momentSendModel.setEditState(MomentEditState.FailedSendFrequently);
            }
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("sendEdit : \teditState=");
        sbOooO0o0.append(momentSendModel.getEditState());
        sbOooO0o0.append(" \tdyId=");
        sbOooO0o0.append(momentSendModel.getPostId());
        sbOooO0o0.append(" \teditId=");
        sbOooO0o0.append(momentSendModel.getEditId());
        sbOooO0o0.append(' ');
        o00O00.OooO0O0(sbOooO0o0.toString());
        return momentSendModel;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x021a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:83:0x0212  */
    /* JADX WARN: Code duplicated, block: B:84:0x0214  */
    /* JADX WARN: Code duplicated, block: B:86:0x0217  */
    public static final Object OooO0OO(o000O00 o000o01, MomentSendModel momentSendModel, Continuation continuation) {
        o000O0O0 o000o0o1;
        ArrayList<OooO00o> arrayList;
        Object objOooO;
        StringBuffer stringBuffer;
        StringBuffer stringBuffer2;
        boolean z;
        boolean z2;
        o000O00 o000o02 = o000o01;
        MomentSendModel momentSendModel2 = momentSendModel;
        Objects.requireNonNull(o000o01);
        if (continuation instanceof o000O0O0) {
            o000o0o1 = (o000O0O0) continuation;
            int i = o000o0o1.f48512OoooO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000o0o1.f48512OoooO0 = i - Integer.MIN_VALUE;
            } else {
                o000o0o1 = new o000O0O0(o000o02, continuation);
            }
        } else {
            o000o0o1 = new o000O0O0(o000o02, continuation);
        }
        o000O0O0 o000o0o2 = o000o0o1;
        Object obj = o000o0o2.f48508Oooo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o000o0o2.f48512OoooO0;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (momentSendModel.getListSendPostImage().isEmpty() || o000O0.OooO0O0(momentSendModel.getListSendPostImage(), momentSendModel.getHttpImagesFromEditMomentDetailUrl(), o000O.f48487Oooo0o)) {
                momentSendModel2.setEditState(MomentEditState.ImageIsNull);
                return momentSendModel2;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList = new ArrayList();
            int i3 = 0;
            for (Object obj2 : momentSendModel.getListSendPostImage()) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String str = (String) obj2;
                OooO00o oooO00o = new OooO00o();
                oooO00o.OooO00o(str);
                if (o00O0.OooO0Oo(str)) {
                    Intrinsics.checkNotNullParameter(str, "<set-?>");
                    oooO00o.f48495OooO0o0 = str;
                    for (ImageView9GridModel imageView9GridModel : momentSendModel.getHttpImagesFromEditMomentDetail()) {
                        if (Intrinsics.areEqual(str, imageView9GridModel.getUrl())) {
                            String url = imageView9GridModel.getUrl();
                            Intrinsics.checkNotNullExpressionValue(url, "imageView9GridModel.url");
                            Intrinsics.checkNotNullParameter(url, "<set-?>");
                            oooO00o.f48492OooO0O0 = url;
                            oooO00o.f48494OooO0Oo = imageView9GridModel.getHeight();
                            oooO00o.f48493OooO0OO = imageView9GridModel.getWidth();
                        }
                    }
                } else {
                    Intrinsics.checkNotNullParameter(str, "<set-?>");
                    oooO00o.f48495OooO0o0 = str;
                    Uri uriOooO0OO = o000Oo0.OooO0OO(o000o02.f48489OooO00o, str);
                    if (uriOooO0OO != null) {
                        Intrinsics.checkNotNullExpressionValue(uriOooO0OO, "getUriFromFilePath(context, path)");
                        oooO00o.f48491OooO00o = uriOooO0OO;
                        Boxing.boxBoolean(arrayList2.add(uriOooO0OO));
                    }
                }
                arrayList.add(oooO00o);
                i3 = i4;
            }
            if (!momentSendModel.localImages().isEmpty()) {
                momentSendModel2.setEditIsNewPic(1);
                CloudFileRepo cloudFileRepo = o000o02.f48490OooO0O0;
                CloudFileType cloudFileType = CloudFileType.MOMENT_EDIT;
                Long lBoxLong = Boxing.boxLong(momentSendModel.getPostId());
                o000o0o2.f48509Oooo0o = o000o02;
                o000o0o2.f48510Oooo0oO = momentSendModel2;
                o000o0o2.f48511Oooo0oo = arrayList;
                o000o0o2.f48512OoooO0 = 1;
                objOooO = cloudFileRepo.OooO(cloudFileType, arrayList2, lBoxLong, true, o000o0o2);
                if (objOooO == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (!arrayList.isEmpty()) {
                String strImgRemoveHost = CloudImageUtilKt.imgRemoveHost(((OooO00o) arrayList.get(0)).f48492OooO0O0);
                String strSubstring = strImgRemoveHost.substring(0, StringsKt__StringsKt.lastIndexOf$default(strImgRemoveHost, "/", 0, false, 6, (Object) null) + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                momentSendModel2.setEditPicFile(strSubstring);
            }
            o000OO00 o000oo01 = new o000OO00(momentSendModel2);
            Objects.requireNonNull(o000o02);
            stringBuffer = new StringBuffer();
            stringBuffer2 = new StringBuffer();
            for (OooO00o oooO00o2 : arrayList) {
                if (stringBuffer.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    stringBuffer.append("|");
                }
                String str2 = oooO00o2.f48492OooO0O0;
                String strSubstring2 = str2.substring(StringsKt__StringsKt.lastIndexOf$default(str2, "/", 0, false, 6, (Object) null) + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                stringBuffer.append(strSubstring2);
                if (stringBuffer2.length() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    stringBuffer2.append("|");
                }
                StringBuilder sb = new StringBuilder();
                sb.append(oooO00o2.f48493OooO0OO);
                sb.append('*');
                sb.append(oooO00o2.f48494OooO0Oo);
                stringBuffer2.append(sb.toString());
                o00O00.OooO0O0("uploadFile = " + oooO00o2);
            }
            String string = stringBuffer.toString();
            Intrinsics.checkNotNullExpressionValue(string, "urlName.toString()");
            String string2 = stringBuffer2.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "sizes.toString()");
            o000oo01.invoke(string, string2);
            momentSendModel2.setEditState(MomentEditState.ImageUploadSuccess);
            return momentSendModel2;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ArrayList arrayList3 = o000o0o2.f48511Oooo0oo;
        momentSendModel2 = o000o0o2.f48510Oooo0oO;
        o000O00 o000o03 = o000o0o2.f48509Oooo0o;
        ResultKt.throwOnFailure(obj);
        objOooO = obj;
        arrayList = arrayList3;
        o000o02 = o000o03;
        List<UploadFileResult> list = (List) objOooO;
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
                    if (Intrinsics.areEqual(oooO00o4.f48491OooO00o, uploadFileResult.getUri())) {
                        oooO00o4.f48493OooO0OO = uploadFileResult.getCloudFileInfo().getImgWidth();
                        oooO00o4.f48494OooO0Oo = uploadFileResult.getCloudFileInfo().getImgHight();
                        String url2 = uploadFileResult.getCloudFileInfo().getUrl();
                        Intrinsics.checkNotNullParameter(url2, "<set-?>");
                        oooO00o4.f48492OooO0O0 = url2;
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
            return momentSendModel2;
        }
        if (!arrayList.isEmpty()) {
            String strImgRemoveHost2 = CloudImageUtilKt.imgRemoveHost(((OooO00o) arrayList.get(0)).f48492OooO0O0);
            String strSubstring3 = strImgRemoveHost2.substring(0, StringsKt__StringsKt.lastIndexOf$default(strImgRemoveHost2, "/", 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
            momentSendModel2.setEditPicFile(strSubstring3);
        }
        o000OO00 o000oo02 = new o000OO00(momentSendModel2);
        Objects.requireNonNull(o000o02);
        stringBuffer = new StringBuffer();
        stringBuffer2 = new StringBuffer();
        while (r2.hasNext()) {
            if (stringBuffer.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                stringBuffer.append("|");
            }
            String str3 = oooO00o2.f48492OooO0O0;
            String strSubstring4 = str3.substring(StringsKt__StringsKt.lastIndexOf$default(str3, "/", 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring4, "this as java.lang.String).substring(startIndex)");
            stringBuffer.append(strSubstring4);
            if (stringBuffer2.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                stringBuffer2.append("|");
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(oooO00o2.f48493OooO0OO);
            sb2.append('*');
            sb2.append(oooO00o2.f48494OooO0Oo);
            stringBuffer2.append(sb2.toString());
            o00O00.OooO0O0("uploadFile = " + oooO00o2);
        }
        String string3 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "urlName.toString()");
        String string4 = stringBuffer2.toString();
        Intrinsics.checkNotNullExpressionValue(string4, "sizes.toString()");
        o000oo02.invoke(string3, string4);
        momentSendModel2.setEditState(MomentEditState.ImageUploadSuccess);
        return momentSendModel2;
    }
}
