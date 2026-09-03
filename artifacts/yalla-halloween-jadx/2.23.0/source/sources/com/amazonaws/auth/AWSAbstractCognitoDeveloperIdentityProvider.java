package com.amazonaws.auth;

import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.regions.RegionUtils;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityClient;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AWSAbstractCognitoDeveloperIdentityProvider extends AWSAbstractCognitoIdentityProvider {
    public AWSAbstractCognitoDeveloperIdentityProvider(String str, Regions regions) {
        super(str, new AmazonCognitoIdentityClient(new AnonymousAWSCredentials(), new ClientConfiguration()));
        ((AmazonWebServiceClient) this.f8999OooO00o).OooOO0O(RegionUtils.OooO00o(regions.OooO0O0()));
    }
}
