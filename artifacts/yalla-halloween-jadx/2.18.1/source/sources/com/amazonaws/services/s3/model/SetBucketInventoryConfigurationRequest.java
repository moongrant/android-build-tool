package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.services.s3.model.inventory.InventoryConfiguration;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class SetBucketInventoryConfigurationRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public String f10918Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public InventoryConfiguration f10919OoooO00;

    public SetBucketInventoryConfigurationRequest() {
    }

    public SetBucketInventoryConfigurationRequest(String str, InventoryConfiguration inventoryConfiguration) {
        this.f10918Oooo = str;
        this.f10919OoooO00 = inventoryConfiguration;
    }
}
