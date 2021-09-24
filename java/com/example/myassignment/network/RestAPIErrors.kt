/*
 * Created by the co-operative bank.
 * Copyright (c) 2020 . All rights reserved.
 * Last modified 4/15/20 6:40 PM
 */

package com.example.myassignment.network

import com.example.myassignment.utils.CustomError
import com.example.myassignment.utils.GlobalError
import com.example.myassignment.utils.GlobalGoBackError


enum class RestAPIErrors(val coopError: CustomError) {
    NoNetworkException(CustomError("No network", null)),
    NoDataException(CustomError("No data", null)),
    GlobalConnectionError(CustomError("", GlobalError("Global connection error"))),
    GlobalGoBackConnectionError(CustomError("", GlobalGoBackError("Global connection error"))),
}
