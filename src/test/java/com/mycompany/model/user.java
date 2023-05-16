package com.mycompany.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class user<updatable, insertable, columnDefinition> {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long userId;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String email;
    private Integer otp;
    private String country;

    public user(Long userId) {
        this.userId = userId;
        private List<funeral> vehicles = new ArrayList();
        @Column(
                nullable = false,
                updatable = false,
                insertable = false,
                columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP"
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    nullable = false,
    updatable = false,
    insertable = false,
    columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP"
            )
    private LocalDate createdAt;
    @Column(
            nullable = false,
            insertable = false,
            columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP"
    )
    private LocalDate updatedAt;

    public Long getUserId() {
        return this.userId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public Integer getOtp() {
        return this.otp;
    }

    public String getCountry() {
        return this.country;
    }

    public List<funeral> getVehicles() {
        return this.funeral;
    }

    public LocalDate getCreatedAt() {
        return this.createdAt;
    }

    public LocalDate getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUserId(final Long userId) {
        this.userId = userId;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public void setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public void setOtp(final Integer otp) {
        this.otp = otp;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public void setVehicles(final List<funeral> vehicles) {
        this.vehicles = vehicles;
    }

    public void setCreatedAt(final LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(final LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof User)) {
            return false;
        } else {
            User other = (User)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label143: {
                    Object this$userId = this.getUserId();
                    Object other$userId = other.getUserId();
                    if (this$userId == null) {
                        if (other$userId == null) {
                            break label143;
                        }
                    } else if (this$userId.equals(other$userId)) {
                        break label143;
                    }

                    return false;
                }

                Object this$otp = this.getOtp();
                Object other$otp = other.getOtp();
                if (this$otp == null) {
                    if (other$otp != null) {
                        return false;
                    }
                } else if (!this$otp.equals(other$otp)) {
                    return false;
                }

                Object this$firstName = this.getFirstName();
                Object other$firstName = other.getFirstName();
                if (this$firstName == null) {
                    if (other$firstName != null) {
                        return false;
                    }
                } else if (!this$firstName.equals(other$firstName)) {
                    return false;
                }

                label122: {
                    Object this$lastName = this.getLastName();
                    Object other$lastName = other.getLastName();
                    if (this$lastName == null) {
                        if (other$lastName == null) {
                            break label122;
                        }
                    } else if (this$lastName.equals(other$lastName)) {
                        break label122;
                    }

                    return false;
                }

                label115: {
                    Object this$address = this.getAddress();
                    Object other$address = other.getAddress();
                    if (this$address == null) {
                        if (other$address == null) {
                            break label115;
                        }
                    } else if (this$address.equals(other$address)) {
                        break label115;
                    }

                    return false;
                }

                Object this$phoneNumber = this.getPhoneNumber();
                Object other$phoneNumber = other.getPhoneNumber();
                if (this$phoneNumber == null) {
                    if (other$phoneNumber != null) {
                        return false;
                    }
                } else if (!this$phoneNumber.equals(other$phoneNumber)) {
                    return false;
                }

                Object this$email = this.getEmail();
                Object other$email = other.getEmail();
                if (this$email == null) {
                    if (other$email != null) {
                        return false;
                    }
                } else if (!this$email.equals(other$email)) {
                    return false;
                }

                label94: {
                    Object this$country = this.getCountry();
                    Object other$country = other.getdistrict();
                    if (this$country == null) {
                        if (other$country == null) {
                            break label94;
                        }
                    } else if (this$country.equals(other$country)) {
                        break label94;
                    }

                    return false;
                }

                label87: {
                    Object this$funeral = this.getVehicles();
                    Object other$vehicles = other.getfuneral();
                    if (this$funeral == null) {
                        boolean other$funeral;
                        if (other$funeral == null) {
                            break label87;
                        }
                    } else if (this$funeral.equals(other$vehicles)) {
                        break label87;
                    }

                    return false;
                }

                Object this$createdAt = this.getCreatedAt();
                Object other$createdAt = other.getCreatedAt();
                if (this$createdAt == null) {
                    if (other$createdAt != null) {
                        return false;
                    }
                } else if (!this$createdAt.equals(other$createdAt)) {
                    return false;
                }

                Object this$updatedAt = this.getUpdatedAt();
                Object other$updatedAt = other.getUpdatedAt();
                if (this$updatedAt == null) {
                    if (other$updatedAt != null) {
                        return false;
                    }
                } else if (!this$updatedAt.equals(other$updatedAt)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof User;
    }

    public int hashCode() {
        int PRIME = true;
        int result = 1;
        Object $userId = this.getUserId();
        int result = result * 59 + ($userId == null ? 43 : $userId.hashCode());
        Object $otp = this.getOtp();
        result = result * 59 + ($otp == null ? 43 : $otp.hashCode());
        Object $firstName = this.getFirstName();
        result = result * 59 + ($firstName == null ? 43 : $firstName.hashCode());
        Object $lastName = this.getLastName();
        result = result * 59 + ($lastName == null ? 43 : $lastName.hashCode());
        Object $address = this.getAddress();
        result = result * 59 + ($address == null ? 43 : $address.hashCode());
        Object $phoneNumber = this.getPhoneNumber();
        result = result * 59 + ($phoneNumber == null ? 43 : $phoneNumber.hashCode());
        Object $email = this.getEmail();
        result = result * 59 + ($email == null ? 43 : $email.hashCode());
        Object $country = this.getCountry();
        result = result * 59 + ($country == null ? 43 : $country.hashCode());
        Object $vehicles = this.getVehicles();
        result = result * 59 + ($vehicles == null ? 43 : $vehicles.hashCode());
        Object $createdAt = this.getCreatedAt();
        result = result * 59 + ($createdAt == null ? 43 : $createdAt.hashCode());
        Object $updatedAt = this.getUpdatedAt();
        result = result * 59 + ($updatedAt == null ? 43 : $updatedAt.hashCode());
        return result;
    }

    public String toString() {
        Long var10000 = this.getUserId();
        return "User(userId=" + var10000 + ", firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ", address=" + this.getAddress() + ", phoneNumber=" + this.getPhoneNumber() + ", email=" + this.getEmail() + ", otp=" + this.getOtp() + ", country=" + this.getCountry() + ", vehicles=" + String.valueOf(this.getVehicles()) + ", createdAt=" + String.valueOf(this.getCreatedAt()) + ", updatedAt=" + String.valueOf(this.getUpdatedAt()) + ")";
    }

    public User(final Long userId, final String firstName, final String lastName, final String address, final String phoneNumber, final String email, final Integer otp, final String country, final List<Vehicle> vehicles, final LocalDate createdAt, final LocalDate updatedAt) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.otp = otp;
        this.country = country;
        this.vehicles = vehicles;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public User() {
    }
}