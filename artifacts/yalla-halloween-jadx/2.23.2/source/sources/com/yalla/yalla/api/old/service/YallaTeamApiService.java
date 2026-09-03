package com.yalla.yalla.api.old.service;

import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import com.yalla.yalla.model.FeedbackModel;
import com.yalla.yalla.model.http.ApiResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J]\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\rJ+\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u0012H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/yalla/yalla/api/old/service/YallaTeamApiService;", "", "feedback", "Lcom/yalla/yalla/model/http/ApiResult;", "Lcom/yalla/yalla/model/FeedbackModel;", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "type", RemoteConfigConstants$RequestFieldKey.APP_VERSION, DeviceRequestsHelper.DEVICE_INFO_MODEL, "sysVersion", "internet", "networkOperator", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitCustomerSatisfaction", "messageId", "", "score", "", "(JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface YallaTeamApiService {
    @FormUrlEncoded
    @POST("/Webservers/User/FeedbackAdd")
    @Nullable
    Object feedback(@Field("comment") @NotNull String str, @Field("type") @NotNull String str2, @Field(RemoteConfigConstants$RequestFieldKey.APP_VERSION) @NotNull String str3, @Field(DeviceRequestsHelper.DEVICE_INFO_MODEL) @NotNull String str4, @Field("sysVersion") @NotNull String str5, @Field("internet") @NotNull String str6, @Field("networkoperator") @NotNull String str7, @NotNull Continuation<? super ApiResult<FeedbackModel>> continuation);

    @FormUrlEncoded
    @POST("/Webservers/Apk/SubmitUserNPS")
    @Nullable
    Object submitCustomerSatisfaction(@Field("messageId") long j, @Field("score") int i, @NotNull Continuation<? super ApiResult<String>> continuation);
}
