Feature: Search item

    Scenario: Search shoes
        Given The "<url>" page of amazon is opened
        When Enter text and search for shoes
        Then Select add to cart  and check out
        
        
Examples:
            | url |
            | https://www.amazon.in |