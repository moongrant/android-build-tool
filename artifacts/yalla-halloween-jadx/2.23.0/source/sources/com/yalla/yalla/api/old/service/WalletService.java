package com.yalla.yalla.api.old.service;

import com.yalla.yalla.model.RechargeMenuConfirmOrderResultModel;
import com.yalla.yalla.model.RechargeMenuCreateOrderResultModel;
import com.yalla.yalla.model.VipCreateOrderResultModel;
import com.yalla.yalla.model.http.ApiResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\bf\u0018\u00002\u00020\u0001J?\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\nJ?\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\nJ!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ?\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\nJ]\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0003\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0016\u001a\u00020\u00062\b\b\u0003\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010\u0019\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\u001a\u001a\u00020\u00062\b\b\u0001\u0010\u001b\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJg\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0003\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0016\u001a\u00020\u00062\b\b\u0003\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010\u0019\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\u001a\u001a\u00020\u00062\b\b\u0001\u0010\u001b\u001a\u00020\u00062\b\b\u0003\u0010\u001e\u001a\u00020\u0015H§@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJI\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u00062\b\b\u0001\u0010\u0019\u001a\u00020\u00062\b\b\u0001\u0010\u001a\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\u001b\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\"JI\u0010#\u001a\b\u0012\u0004\u0012\u00020!0\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u00062\b\b\u0001\u0010\u0019\u001a\u00020\u00062\b\b\u0001\u0010\u001a\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\u001b\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\"JS\u0010$\u001a\b\u0012\u0004\u0012\u00020!0\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u00062\b\b\u0001\u0010%\u001a\u00020\u00062\b\b\u0001\u0010\u0019\u001a\u00020\u00062\b\b\u0001\u0010\u001a\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010&\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010'J?\u0010(\u001a\b\u0012\u0004\u0012\u00020!0\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u00062\b\b\u0001\u0010\u0019\u001a\u00020\u00062\b\b\u0001\u0010\u001a\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\nJq\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u00152\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010*\u001a\u00020\u00062\b\b\u0001\u0010+\u001a\u00020\u00152\b\b\u0001\u0010,\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010-\u001a\u00020\u0015H§@ø\u0001\u0000¢\u0006\u0002\u0010.J!\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u00100\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, d2 = {"Lcom/yalla/yalla/api/old/service/WalletService;", "", "confirmRechargeOrderGoogle", "Lcom/yalla/yalla/model/http/ApiResult;", "Lcom/yalla/yalla/model/RechargeMenuConfirmOrderResultModel;", "orderId", "", "productId", "purchasetoken", "sign", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmRechargeOrderHuaWei", "purchaseToken", "accountFlag", "confirmRechargeOrderPayssion", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmRechargeOrderTapPay", "confirmSubscriptionOrderGoogle", "createOrderGoogleSubscribe", "Lcom/yalla/yalla/model/VipCreateOrderResultModel;", "subscribeUpt", "", "shopId", "amount", "", "iden", "sku", "currency", "(ILjava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createOrderHuaWeiSubscribe", "channelType", "(ILjava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createRechargeOrderGoogle", "Lcom/yalla/yalla/model/RechargeMenuCreateOrderResultModel;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createRechargeOrderHuaWeiPay", "createRechargeOrderPayssion", "pmid", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createRechargeOrderTapPay", "huaWeiSubscribePremium", "subOrderId", "buyType", "subscriptionId", "sandbox", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadLogPayError", "errort", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface WalletService {

    public static final class OooO00o {
    }

    @GET("/Webservers/Recharge/RechargeCoinAndroidV1")
    @Nullable
    Object confirmRechargeOrderGoogle(@NotNull @Query("orderid") String str, @NotNull @Query("productid") String str2, @NotNull @Query("purchasetoken") String str3, @NotNull @Query("sign") String str4, @NotNull Continuation<? super ApiResult<RechargeMenuConfirmOrderResultModel>> continuation);

    @FormUrlEncoded
    @POST("/Webservers/Recharge/HuaweiNotifyUrl")
    @Nullable
    Object confirmRechargeOrderHuaWei(@Field("orderid") @NotNull String str, @Field("productId") @NotNull String str2, @Field("purchaseToken") @NotNull String str3, @Field("accountFlag") @NotNull String str4, @NotNull Continuation<? super ApiResult<RechargeMenuConfirmOrderResultModel>> continuation);

    @GET("/Webservers/Recharge/PayssionState")
    @Nullable
    Object confirmRechargeOrderPayssion(@NotNull @Query("orderid") String str, @NotNull Continuation<? super ApiResult<RechargeMenuConfirmOrderResultModel>> continuation);

    @GET("/Webservers/Recharge/TapPayState")
    @Nullable
    Object confirmRechargeOrderTapPay(@NotNull @Query("orderId") String str, @NotNull Continuation<? super ApiResult<RechargeMenuConfirmOrderResultModel>> continuation);

    @GET("/Webservers/Recharge/RechargeShopAndroid")
    @Nullable
    Object confirmSubscriptionOrderGoogle(@NotNull @Query("orderid") String str, @NotNull @Query("productid") String str2, @NotNull @Query("purchasetoken") String str3, @NotNull @Query("sign") String str4, @NotNull Continuation<? super ApiResult<RechargeMenuConfirmOrderResultModel>> continuation);

    @GET("/Webservers/Recharge/RechargeShopOrder")
    @Nullable
    Object createOrderGoogleSubscribe(@Query("subscribeUpt") int i, @NotNull @Query("shopid") String str, @Query("amount") double d, @NotNull @Query("iden") String str2, @NotNull @Query("sign") String str3, @NotNull @Query("sku") String str4, @NotNull @Query("currency") String str5, @NotNull Continuation<? super ApiResult<VipCreateOrderResultModel>> continuation);

    @GET("/Webservers/Recharge/RechargeShopOrder")
    @Nullable
    Object createOrderHuaWeiSubscribe(@Query("subscribeUpt") int i, @NotNull @Query("shopid") String str, @Query("amount") double d, @NotNull @Query("iden") String str2, @NotNull @Query("sign") String str3, @NotNull @Query("sku") String str4, @NotNull @Query("currency") String str5, @Query("channelType") int i2, @NotNull Continuation<? super ApiResult<VipCreateOrderResultModel>> continuation);

    @Headers({"Abnormal:true"})
    @GET("/Webservers/Recharge/RechargeCoinOrder")
    @Nullable
    Object createRechargeOrderGoogle(@NotNull @Query("amount") String str, @NotNull @Query("iden") String str2, @NotNull @Query("sku") String str3, @NotNull @Query("sign") String str4, @NotNull @Query("currency") String str5, @NotNull Continuation<? super ApiResult<RechargeMenuCreateOrderResultModel>> continuation);

    @GET("/Webservers/Recharge/HuaweiPayOrder")
    @Nullable
    Object createRechargeOrderHuaWeiPay(@NotNull @Query("amount") String str, @NotNull @Query("iden") String str2, @NotNull @Query("sku") String str3, @NotNull @Query("sign") String str4, @NotNull @Query("currency") String str5, @NotNull Continuation<? super ApiResult<RechargeMenuCreateOrderResultModel>> continuation);

    @GET("/Webservers/Recharge/PayssionPayOrder")
    @Nullable
    Object createRechargeOrderPayssion(@NotNull @Query("amount") String str, @NotNull @Query("pmid") String str2, @NotNull @Query("iden") String str3, @NotNull @Query("sku") String str4, @NotNull @Query("sign") String str5, @NotNull @Query("description") String str6, @NotNull Continuation<? super ApiResult<RechargeMenuCreateOrderResultModel>> continuation);

    @GET("/Webservers/Recharge/TapPayOrder")
    @Nullable
    Object createRechargeOrderTapPay(@NotNull @Query("amount") String str, @NotNull @Query("iden") String str2, @NotNull @Query("sku") String str3, @NotNull @Query("sign") String str4, @NotNull Continuation<? super ApiResult<RechargeMenuCreateOrderResultModel>> continuation);

    @FormUrlEncoded
    @POST("/Webservers/Recharge/HuaWeiSubscribePremium")
    @Nullable
    Object huaWeiSubscribePremium(@Field("sign") @NotNull String str, @Field("accountFlag") int i, @Field("orderId") @NotNull String str2, @Field("subOrderId") @NotNull String str3, @Field("buyType") int i2, @Field("subscriptionId") @NotNull String str4, @Field("purchaseToken") @NotNull String str5, @Field("productId") @NotNull String str6, @Field("sandbox") int i3, @NotNull Continuation<? super ApiResult<RechargeMenuConfirmOrderResultModel>> continuation);

    @FormUrlEncoded
    @POST("/Webservers/Recharge/RechargeErrort")
    @Nullable
    Object uploadLogPayError(@Field("errort") @NotNull String str, @NotNull Continuation<? super ApiResult<String>> continuation);
}
